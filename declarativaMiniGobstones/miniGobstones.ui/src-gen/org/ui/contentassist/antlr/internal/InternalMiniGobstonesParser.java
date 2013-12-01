package org.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.services.MiniGobstonesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniGobstonesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Verde'", "'Rojo'", "'Azul'", "'Negro'", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'procedure'", "'{'", "'}'", "'Poner'", "'('", "')'", "'Mover'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMiniGobstonesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniGobstonesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniGobstonesParser.tokenNames; }
    public String getGrammarFileName() { return "../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g"; }


     
     	private MiniGobstonesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MiniGobstonesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:61:1: ( ruleModel EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:69:1: ruleModel : ( ( rule__Model__MainAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:73:2: ( ( ( rule__Model__MainAssignment ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:74:1: ( ( rule__Model__MainAssignment ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:74:1: ( ( rule__Model__MainAssignment ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:75:1: ( rule__Model__MainAssignment )
            {
             before(grammarAccess.getModelAccess().getMainAssignment()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:76:1: ( rule__Model__MainAssignment )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:76:2: rule__Model__MainAssignment
            {
            pushFollow(FOLLOW_rule__Model__MainAssignment_in_ruleModel94);
            rule__Model__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMainAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcedure"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:88:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:89:1: ( ruleProcedure EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:90:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure121);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:97:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:101:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:102:1: ( ( rule__Procedure__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:102:1: ( ( rule__Procedure__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:103:1: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:104:1: ( rule__Procedure__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:104:2: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0_in_ruleProcedure154);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleCommand"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:116:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:117:1: ( ruleCommand EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:118:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand181);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:125:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:129:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:130:1: ( ( rule__Command__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:130:1: ( ( rule__Command__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:131:1: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:132:1: ( rule__Command__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:132:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand214);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRulePoner"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:144:1: entryRulePoner : rulePoner EOF ;
    public final void entryRulePoner() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:145:1: ( rulePoner EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:146:1: rulePoner EOF
            {
             before(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner241);
            rulePoner();

            state._fsp--;

             after(grammarAccess.getPonerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoner"


    // $ANTLR start "rulePoner"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:153:1: rulePoner : ( ( rule__Poner__Group__0 ) ) ;
    public final void rulePoner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:157:2: ( ( ( rule__Poner__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:158:1: ( ( rule__Poner__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:158:1: ( ( rule__Poner__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:159:1: ( rule__Poner__Group__0 )
            {
             before(grammarAccess.getPonerAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:160:1: ( rule__Poner__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:160:2: rule__Poner__Group__0
            {
            pushFollow(FOLLOW_rule__Poner__Group__0_in_rulePoner274);
            rule__Poner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPonerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoner"


    // $ANTLR start "entryRuleMover"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:172:1: entryRuleMover : ruleMover EOF ;
    public final void entryRuleMover() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:173:1: ( ruleMover EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:174:1: ruleMover EOF
            {
             before(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover301);
            ruleMover();

            state._fsp--;

             after(grammarAccess.getMoverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMover"


    // $ANTLR start "ruleMover"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:181:1: ruleMover : ( ( rule__Mover__Group__0 ) ) ;
    public final void ruleMover() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:185:2: ( ( ( rule__Mover__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:186:1: ( ( rule__Mover__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:186:1: ( ( rule__Mover__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:187:1: ( rule__Mover__Group__0 )
            {
             before(grammarAccess.getMoverAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:188:1: ( rule__Mover__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:188:2: rule__Mover__Group__0
            {
            pushFollow(FOLLOW_rule__Mover__Group__0_in_ruleMover334);
            rule__Mover__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMover"


    // $ANTLR start "ruleColor"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:201:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:205:1: ( ( ( rule__Color__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:206:1: ( ( rule__Color__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:206:1: ( ( rule__Color__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:207:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:208:1: ( rule__Color__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:208:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor371);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleDireccion"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:220:1: ruleDireccion : ( ( rule__Direccion__Alternatives ) ) ;
    public final void ruleDireccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:224:1: ( ( ( rule__Direccion__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:225:1: ( ( rule__Direccion__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:225:1: ( ( rule__Direccion__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:226:1: ( rule__Direccion__Alternatives )
            {
             before(grammarAccess.getDireccionAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:227:1: ( rule__Direccion__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:227:2: rule__Direccion__Alternatives
            {
            pushFollow(FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion407);
            rule__Direccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDireccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDireccion"


    // $ANTLR start "rule__Command__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:238:1: rule__Command__Alternatives : ( ( rulePoner ) | ( ruleMover ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:242:1: ( ( rulePoner ) | ( ruleMover ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:243:1: ( rulePoner )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:243:1: ( rulePoner )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:244:1: rulePoner
                    {
                     before(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePoner_in_rule__Command__Alternatives442);
                    rulePoner();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:249:6: ( ruleMover )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:249:6: ( ruleMover )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:250:1: ruleMover
                    {
                     before(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMover_in_rule__Command__Alternatives459);
                    ruleMover();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:260:1: rule__Color__Alternatives : ( ( ( 'Verde' ) ) | ( ( 'Rojo' ) ) | ( ( 'Azul' ) ) | ( ( 'Negro' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:264:1: ( ( ( 'Verde' ) ) | ( ( 'Rojo' ) ) | ( ( 'Azul' ) ) | ( ( 'Negro' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:265:1: ( ( 'Verde' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:265:1: ( ( 'Verde' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:266:1: ( 'Verde' )
                    {
                     before(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:267:1: ( 'Verde' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:267:3: 'Verde'
                    {
                    match(input,11,FOLLOW_11_in_rule__Color__Alternatives492); 

                    }

                     after(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:272:6: ( ( 'Rojo' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:272:6: ( ( 'Rojo' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:273:1: ( 'Rojo' )
                    {
                     before(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:274:1: ( 'Rojo' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:274:3: 'Rojo'
                    {
                    match(input,12,FOLLOW_12_in_rule__Color__Alternatives513); 

                    }

                     after(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:279:6: ( ( 'Azul' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:279:6: ( ( 'Azul' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:280:1: ( 'Azul' )
                    {
                     before(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:281:1: ( 'Azul' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:281:3: 'Azul'
                    {
                    match(input,13,FOLLOW_13_in_rule__Color__Alternatives534); 

                    }

                     after(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:286:6: ( ( 'Negro' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:286:6: ( ( 'Negro' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:287:1: ( 'Negro' )
                    {
                     before(grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:288:1: ( 'Negro' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:288:3: 'Negro'
                    {
                    match(input,14,FOLLOW_14_in_rule__Color__Alternatives555); 

                    }

                     after(grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Direccion__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:298:1: rule__Direccion__Alternatives : ( ( ( 'Norte' ) ) | ( ( 'Sur' ) ) | ( ( 'Este' ) ) | ( ( 'Oeste' ) ) );
    public final void rule__Direccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:302:1: ( ( ( 'Norte' ) ) | ( ( 'Sur' ) ) | ( ( 'Este' ) ) | ( ( 'Oeste' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:303:1: ( ( 'Norte' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:303:1: ( ( 'Norte' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:304:1: ( 'Norte' )
                    {
                     before(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:305:1: ( 'Norte' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:305:3: 'Norte'
                    {
                    match(input,15,FOLLOW_15_in_rule__Direccion__Alternatives591); 

                    }

                     after(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:310:6: ( ( 'Sur' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:310:6: ( ( 'Sur' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:311:1: ( 'Sur' )
                    {
                     before(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:312:1: ( 'Sur' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:312:3: 'Sur'
                    {
                    match(input,16,FOLLOW_16_in_rule__Direccion__Alternatives612); 

                    }

                     after(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:317:6: ( ( 'Este' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:317:6: ( ( 'Este' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:318:1: ( 'Este' )
                    {
                     before(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:319:1: ( 'Este' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:319:3: 'Este'
                    {
                    match(input,17,FOLLOW_17_in_rule__Direccion__Alternatives633); 

                    }

                     after(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:324:6: ( ( 'Oeste' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:324:6: ( ( 'Oeste' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:325:1: ( 'Oeste' )
                    {
                     before(grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:326:1: ( 'Oeste' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:326:3: 'Oeste'
                    {
                    match(input,18,FOLLOW_18_in_rule__Direccion__Alternatives654); 

                    }

                     after(grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direccion__Alternatives"


    // $ANTLR start "rule__Procedure__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:338:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:342:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:343:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__0687);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__0690);
            rule__Procedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:350:1: rule__Procedure__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:354:1: ( ( 'procedure' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:355:1: ( 'procedure' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:355:1: ( 'procedure' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:356:1: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Procedure__Group__0__Impl718); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:369:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:373:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:374:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__1749);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__1752);
            rule__Procedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:381:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:385:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:386:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:386:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:387:1: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:388:1: ( rule__Procedure__NameAssignment_1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:388:2: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl779);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:398:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:402:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:403:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__2809);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__2812);
            rule__Procedure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:410:1: rule__Procedure__Group__2__Impl : ( '{' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:414:1: ( ( '{' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:415:1: ( '{' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:415:1: ( '{' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:416:1: '{'
            {
             before(grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Procedure__Group__2__Impl840); 
             after(grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:429:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:433:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:434:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__3871);
            rule__Procedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__4_in_rule__Procedure__Group__3874);
            rule__Procedure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:441:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__CommandsAssignment_3 )* ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:445:1: ( ( ( rule__Procedure__CommandsAssignment_3 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:446:1: ( ( rule__Procedure__CommandsAssignment_3 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:446:1: ( ( rule__Procedure__CommandsAssignment_3 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:447:1: ( rule__Procedure__CommandsAssignment_3 )*
            {
             before(grammarAccess.getProcedureAccess().getCommandsAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:448:1: ( rule__Procedure__CommandsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:448:2: rule__Procedure__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Procedure__CommandsAssignment_3_in_rule__Procedure__Group__3__Impl901);
            	    rule__Procedure__CommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getCommandsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__Procedure__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:458:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:462:1: ( rule__Procedure__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:463:2: rule__Procedure__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__4__Impl_in_rule__Procedure__Group__4932);
            rule__Procedure__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4"


    // $ANTLR start "rule__Procedure__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:469:1: rule__Procedure__Group__4__Impl : ( '}' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:473:1: ( ( '}' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:474:1: ( '}' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:474:1: ( '}' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:475:1: '}'
            {
             before(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Procedure__Group__4__Impl960); 
             after(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4__Impl"


    // $ANTLR start "rule__Poner__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:498:1: rule__Poner__Group__0 : rule__Poner__Group__0__Impl rule__Poner__Group__1 ;
    public final void rule__Poner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:502:1: ( rule__Poner__Group__0__Impl rule__Poner__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:503:2: rule__Poner__Group__0__Impl rule__Poner__Group__1
            {
            pushFollow(FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__01001);
            rule__Poner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__01004);
            rule__Poner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__0"


    // $ANTLR start "rule__Poner__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:510:1: rule__Poner__Group__0__Impl : ( () ) ;
    public final void rule__Poner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:514:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:515:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:515:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:516:1: ()
            {
             before(grammarAccess.getPonerAccess().getPonerAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:517:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:519:1: 
            {
            }

             after(grammarAccess.getPonerAccess().getPonerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__0__Impl"


    // $ANTLR start "rule__Poner__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:529:1: rule__Poner__Group__1 : rule__Poner__Group__1__Impl rule__Poner__Group__2 ;
    public final void rule__Poner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:533:1: ( rule__Poner__Group__1__Impl rule__Poner__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:534:2: rule__Poner__Group__1__Impl rule__Poner__Group__2
            {
            pushFollow(FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__11062);
            rule__Poner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__11065);
            rule__Poner__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__1"


    // $ANTLR start "rule__Poner__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:541:1: rule__Poner__Group__1__Impl : ( 'Poner' ) ;
    public final void rule__Poner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:545:1: ( ( 'Poner' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:546:1: ( 'Poner' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:546:1: ( 'Poner' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:547:1: 'Poner'
            {
             before(grammarAccess.getPonerAccess().getPonerKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Poner__Group__1__Impl1093); 
             after(grammarAccess.getPonerAccess().getPonerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__1__Impl"


    // $ANTLR start "rule__Poner__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:560:1: rule__Poner__Group__2 : rule__Poner__Group__2__Impl rule__Poner__Group__3 ;
    public final void rule__Poner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:564:1: ( rule__Poner__Group__2__Impl rule__Poner__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:565:2: rule__Poner__Group__2__Impl rule__Poner__Group__3
            {
            pushFollow(FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__21124);
            rule__Poner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__21127);
            rule__Poner__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__2"


    // $ANTLR start "rule__Poner__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:572:1: rule__Poner__Group__2__Impl : ( '(' ) ;
    public final void rule__Poner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:576:1: ( ( '(' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:577:1: ( '(' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:577:1: ( '(' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:578:1: '('
            {
             before(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Poner__Group__2__Impl1155); 
             after(grammarAccess.getPonerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__2__Impl"


    // $ANTLR start "rule__Poner__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:591:1: rule__Poner__Group__3 : rule__Poner__Group__3__Impl rule__Poner__Group__4 ;
    public final void rule__Poner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:595:1: ( rule__Poner__Group__3__Impl rule__Poner__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:596:2: rule__Poner__Group__3__Impl rule__Poner__Group__4
            {
            pushFollow(FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__31186);
            rule__Poner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__4_in_rule__Poner__Group__31189);
            rule__Poner__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__3"


    // $ANTLR start "rule__Poner__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:603:1: rule__Poner__Group__3__Impl : ( ( rule__Poner__ColorAssignment_3 ) ) ;
    public final void rule__Poner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:607:1: ( ( ( rule__Poner__ColorAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:608:1: ( ( rule__Poner__ColorAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:608:1: ( ( rule__Poner__ColorAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:609:1: ( rule__Poner__ColorAssignment_3 )
            {
             before(grammarAccess.getPonerAccess().getColorAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:610:1: ( rule__Poner__ColorAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:610:2: rule__Poner__ColorAssignment_3
            {
            pushFollow(FOLLOW_rule__Poner__ColorAssignment_3_in_rule__Poner__Group__3__Impl1216);
            rule__Poner__ColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPonerAccess().getColorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__3__Impl"


    // $ANTLR start "rule__Poner__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:620:1: rule__Poner__Group__4 : rule__Poner__Group__4__Impl ;
    public final void rule__Poner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:624:1: ( rule__Poner__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:625:2: rule__Poner__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Poner__Group__4__Impl_in_rule__Poner__Group__41246);
            rule__Poner__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__4"


    // $ANTLR start "rule__Poner__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:631:1: rule__Poner__Group__4__Impl : ( ')' ) ;
    public final void rule__Poner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:635:1: ( ( ')' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:636:1: ( ')' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:636:1: ( ')' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:637:1: ')'
            {
             before(grammarAccess.getPonerAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Poner__Group__4__Impl1274); 
             after(grammarAccess.getPonerAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__4__Impl"


    // $ANTLR start "rule__Mover__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:660:1: rule__Mover__Group__0 : rule__Mover__Group__0__Impl rule__Mover__Group__1 ;
    public final void rule__Mover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:664:1: ( rule__Mover__Group__0__Impl rule__Mover__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:665:2: rule__Mover__Group__0__Impl rule__Mover__Group__1
            {
            pushFollow(FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__01315);
            rule__Mover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__01318);
            rule__Mover__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__0"


    // $ANTLR start "rule__Mover__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:672:1: rule__Mover__Group__0__Impl : ( () ) ;
    public final void rule__Mover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:676:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:677:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:677:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:678:1: ()
            {
             before(grammarAccess.getMoverAccess().getMoverAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:679:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:681:1: 
            {
            }

             after(grammarAccess.getMoverAccess().getMoverAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__0__Impl"


    // $ANTLR start "rule__Mover__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:691:1: rule__Mover__Group__1 : rule__Mover__Group__1__Impl rule__Mover__Group__2 ;
    public final void rule__Mover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:695:1: ( rule__Mover__Group__1__Impl rule__Mover__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:696:2: rule__Mover__Group__1__Impl rule__Mover__Group__2
            {
            pushFollow(FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__11376);
            rule__Mover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__11379);
            rule__Mover__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__1"


    // $ANTLR start "rule__Mover__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:703:1: rule__Mover__Group__1__Impl : ( 'Mover' ) ;
    public final void rule__Mover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:707:1: ( ( 'Mover' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:708:1: ( 'Mover' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:708:1: ( 'Mover' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:709:1: 'Mover'
            {
             before(grammarAccess.getMoverAccess().getMoverKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Mover__Group__1__Impl1407); 
             after(grammarAccess.getMoverAccess().getMoverKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__1__Impl"


    // $ANTLR start "rule__Mover__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:722:1: rule__Mover__Group__2 : rule__Mover__Group__2__Impl rule__Mover__Group__3 ;
    public final void rule__Mover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:726:1: ( rule__Mover__Group__2__Impl rule__Mover__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:727:2: rule__Mover__Group__2__Impl rule__Mover__Group__3
            {
            pushFollow(FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__21438);
            rule__Mover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__21441);
            rule__Mover__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__2"


    // $ANTLR start "rule__Mover__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:734:1: rule__Mover__Group__2__Impl : ( '(' ) ;
    public final void rule__Mover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:738:1: ( ( '(' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:739:1: ( '(' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:739:1: ( '(' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:740:1: '('
            {
             before(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Mover__Group__2__Impl1469); 
             after(grammarAccess.getMoverAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__2__Impl"


    // $ANTLR start "rule__Mover__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:753:1: rule__Mover__Group__3 : rule__Mover__Group__3__Impl rule__Mover__Group__4 ;
    public final void rule__Mover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:757:1: ( rule__Mover__Group__3__Impl rule__Mover__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:758:2: rule__Mover__Group__3__Impl rule__Mover__Group__4
            {
            pushFollow(FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__31500);
            rule__Mover__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__4_in_rule__Mover__Group__31503);
            rule__Mover__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__3"


    // $ANTLR start "rule__Mover__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:765:1: rule__Mover__Group__3__Impl : ( ( rule__Mover__DirAssignment_3 ) ) ;
    public final void rule__Mover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:769:1: ( ( ( rule__Mover__DirAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:770:1: ( ( rule__Mover__DirAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:770:1: ( ( rule__Mover__DirAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:771:1: ( rule__Mover__DirAssignment_3 )
            {
             before(grammarAccess.getMoverAccess().getDirAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:772:1: ( rule__Mover__DirAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:772:2: rule__Mover__DirAssignment_3
            {
            pushFollow(FOLLOW_rule__Mover__DirAssignment_3_in_rule__Mover__Group__3__Impl1530);
            rule__Mover__DirAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoverAccess().getDirAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__3__Impl"


    // $ANTLR start "rule__Mover__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:782:1: rule__Mover__Group__4 : rule__Mover__Group__4__Impl ;
    public final void rule__Mover__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:786:1: ( rule__Mover__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:787:2: rule__Mover__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mover__Group__4__Impl_in_rule__Mover__Group__41560);
            rule__Mover__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__4"


    // $ANTLR start "rule__Mover__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:793:1: rule__Mover__Group__4__Impl : ( ')' ) ;
    public final void rule__Mover__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:797:1: ( ( ')' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:798:1: ( ')' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:798:1: ( ')' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:799:1: ')'
            {
             before(grammarAccess.getMoverAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Mover__Group__4__Impl1588); 
             after(grammarAccess.getMoverAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__4__Impl"


    // $ANTLR start "rule__Model__MainAssignment"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:823:1: rule__Model__MainAssignment : ( ruleProcedure ) ;
    public final void rule__Model__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:827:1: ( ( ruleProcedure ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:828:1: ( ruleProcedure )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:828:1: ( ruleProcedure )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:829:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__MainAssignment1634);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MainAssignment"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:838:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:842:1: ( ( RULE_ID ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:843:1: ( RULE_ID )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:843:1: ( RULE_ID )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:844:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_11665); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__CommandsAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:853:1: rule__Procedure__CommandsAssignment_3 : ( ruleCommand ) ;
    public final void rule__Procedure__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:857:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:858:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:858:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:859:1: ruleCommand
            {
             before(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__Procedure__CommandsAssignment_31696);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__CommandsAssignment_3"


    // $ANTLR start "rule__Poner__ColorAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:868:1: rule__Poner__ColorAssignment_3 : ( ruleColor ) ;
    public final void rule__Poner__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:872:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:873:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:873:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:874:1: ruleColor
            {
             before(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Poner__ColorAssignment_31727);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__ColorAssignment_3"


    // $ANTLR start "rule__Mover__DirAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:883:1: rule__Mover__DirAssignment_3 : ( ruleDireccion ) ;
    public final void rule__Mover__DirAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:887:1: ( ( ruleDireccion ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:888:1: ( ruleDireccion )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:888:1: ( ruleDireccion )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:889:1: ruleDireccion
            {
             before(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__Mover__DirAssignment_31758);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__DirAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MainAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0_in_ruleProcedure154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0_in_rulePoner274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0_in_ruleMover334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_rule__Command__Alternatives442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_rule__Command__Alternatives459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Color__Alternatives492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Color__Alternatives513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Color__Alternatives534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Color__Alternatives555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Direccion__Alternatives591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Direccion__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Direccion__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Direccion__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__0687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__0690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Procedure__Group__0__Impl718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__1749 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__2809 = new BitSet(new long[]{0x0000000002600000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Procedure__Group__2__Impl840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__3871 = new BitSet(new long[]{0x0000000002600000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__4_in_rule__Procedure__Group__3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__CommandsAssignment_3_in_rule__Procedure__Group__3__Impl901 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__4__Impl_in_rule__Procedure__Group__4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Procedure__Group__4__Impl960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__01001 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__01004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__11062 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Poner__Group__1__Impl1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__21124 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__21127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Poner__Group__2__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__31186 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__4_in_rule__Poner__Group__31189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__ColorAssignment_3_in_rule__Poner__Group__3__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__4__Impl_in_rule__Poner__Group__41246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Poner__Group__4__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__01315 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__01318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__11376 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mover__Group__1__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__21438 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__21441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Mover__Group__2__Impl1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__31500 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__4_in_rule__Mover__Group__31503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__DirAssignment_3_in_rule__Mover__Group__3__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__4__Impl_in_rule__Mover__Group__41560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mover__Group__4__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__MainAssignment1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_11665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Procedure__CommandsAssignment_31696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Poner__ColorAssignment_31727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__Mover__DirAssignment_31758 = new BitSet(new long[]{0x0000000000000002L});

}