package org.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.miniGobstones.Color;
import org.miniGobstones.Command;
import org.miniGobstones.Direccion;
import org.miniGobstones.Model;
import org.miniGobstones.Mover;
import org.miniGobstones.Poner;
import org.miniGobstones.Procedure;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MiniGobstonesGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    StringConcatenation _builder = new StringConcatenation();
    String _packageName = this.packageName(model);
    _builder.append(_packageName, "");
    _builder.append("/");
    Resource _eResource = model.eResource();
    String _className = this.className(_eResource);
    _builder.append(_className, "");
    _builder.append(".java");
    CharSequence _javaCode = this.toJavaCode(model);
    fsa.generateFile(_builder.toString(), _javaCode);
  }
  
  public String packageName(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("miniGobstones/runner");
    return _builder.toString();
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    String _substring = name.substring(0, _indexOf);
    return StringExtensions.toFirstUpper(_substring);
  }
  
  public CharSequence toJavaCode(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = this.packageName(model);
    String _replace = _packageName.replace("/", ".");
    _builder.append(_replace, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import modeloMiniGobstones.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Generates code from your model ");
    Resource _eResource = model.eResource();
    String _className = this.className(_eResource);
    String _firstLower = StringExtensions.toFirstLower(_className);
    _builder.append(_firstLower, "	");
    _builder.append(".mbgs");
    _builder.newLineIfNotEmpty();
    _builder.append("**/");
    _builder.newLine();
    _builder.append("public class ");
    Resource _eResource_1 = model.eResource();
    String _className_1 = this.className(_eResource_1);
    _builder.append(_className_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private static Cabezal cabezal = new Cabezal();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _compile = this.compile(model);
    _builder.append(_compile, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cabezal.imprimirTablero();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Procedure _main = model.getMain();
      EList<Command> _commands = _main.getCommands();
      for(final Command command : _commands) {
        CharSequence _genCompile = this.genCompile(command);
        _builder.append(_genCompile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genCompile(final Poner poner) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cabezal.poner(Color.");
    Color _color = poner.getColor();
    _builder.append(_color, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genCompile(final Mover mover) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cabezal.mover(Direccion.");
    Direccion _dir = mover.getDir();
    _builder.append(_dir, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genCompile(final Command mover) {
    if (mover instanceof Mover) {
      return _genCompile((Mover)mover);
    } else if (mover instanceof Poner) {
      return _genCompile((Poner)mover);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mover).toString());
    }
  }
}
