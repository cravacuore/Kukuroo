package org.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.miniGobstones.MiniGobstonesPackage;
import org.miniGobstones.Model;
import org.miniGobstones.Mover;
import org.miniGobstones.Poner;
import org.miniGobstones.Procedure;
import org.services.MiniGobstonesGrammarAccess;

@SuppressWarnings("all")
public class MiniGobstonesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MiniGobstonesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MiniGobstonesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MiniGobstonesPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.MOVER:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getMoverRule()) {
					sequence_Mover(context, (Mover) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.PONER:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getPonerRule()) {
					sequence_Poner(context, (Poner) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     main=Procedure
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.MODEL__MAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.MODEL__MAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0(), semanticObject.getMain());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dir=Direccion
	 */
	protected void sequence_Mover(EObject context, Mover semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.MOVER__DIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.MOVER__DIR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0(), semanticObject.getDir());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_Poner(EObject context, Poner semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.PONER__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.PONER__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID commands+=Command*)
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
