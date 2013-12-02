package org.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.miniGobstones.Model
import org.miniGobstones.Mover
import org.miniGobstones.Poner

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MiniGobstonesGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var model = resource.contents.head as Model
		fsa.generateFile('''«model.packageName»/«model.eResource.className».java''', toJavaCode(model));
	}
	
	def packageName(Model model){
		return'''miniGobstones/runner'''
	}
	
	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.')).toFirstUpper
	}

	def toJavaCode(Model model) {'''
			package «model.packageName.replace('/', '.')»;
			
			import modeloMiniGobstones.*;
			
			/**
				Generates code from your model «model.eResource.className.toFirstLower».mbgs
			**/
			public class «model.eResource.className» {
				private static Cabezal cabezal = new Cabezal();
				
				public static void main(String[] args) {
					«model.compile»
					
					cabezal.imprimirTablero();
				}
			}
		'''
	}
	
	def compile(Model model) {'''
			«FOR command : model.main.commands»
				«command.genCompile»
			«ENDFOR»
		'''
	}

	def dispatch genCompile(Poner poner){'''
		cabezal.poner(Color.«poner.color»);
	'''	
	}
	
	def dispatch genCompile(Mover mover){'''
		cabezal.mover(Direccion.«mover.dir»);
	'''
	}

//	def compile(Command command) {
//		return switch command.eClass.name {
//			case "Poner" : '''Cabezal.getInstance().poner(«(command as Poner).color»);'''
//			case "Mover" : '''Cabezal.getInstance().mover(«(command as Mover).dir»);'''
//			default : ''''''
//		}
//	}
}
