package org.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.MiniGobstonesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniGobstonesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'{'", "'}'", "'Poner'", "'('", "')'", "'Mover'", "'Verde'", "'Rojo'", "'Azul'", "'Negro'", "'Norte'", "'Sur'", "'Este'", "'Oeste'"
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
    public String getGrammarFileName() { return "../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g"; }



     	private MiniGobstonesGrammarAccess grammarAccess;
     	
        public InternalMiniGobstonesParser(TokenStream input, MiniGobstonesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MiniGobstonesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:77:1: ruleModel returns [EObject current=null] : ( (lv_main_0_0= ruleProcedure ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:80:28: ( ( (lv_main_0_0= ruleProcedure ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:81:1: ( (lv_main_0_0= ruleProcedure ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:81:1: ( (lv_main_0_0= ruleProcedure ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:82:1: (lv_main_0_0= ruleProcedure )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:82:1: (lv_main_0_0= ruleProcedure )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:83:3: lv_main_0_0= ruleProcedure
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleProcedure_in_ruleModel130);
            lv_main_0_0=ruleProcedure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_0_0, 
                    		"Procedure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcedure"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:107:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:108:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:109:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure165);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:116:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:119:28: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:120:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:120:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:120:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProcedure212); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:125:1: (lv_name_1_0= RULE_ID )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProcedure246); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:146:1: ( (lv_commands_3_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:147:1: (lv_commands_3_0= ruleCommand )
            	    {
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:147:1: (lv_commands_3_0= ruleCommand )
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:148:3: lv_commands_3_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleProcedure267);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_3_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProcedure280); 

                	newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleCommand"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:176:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:177:2: (iv_ruleCommand= ruleCommand EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:178:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand316);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:185:1: ruleCommand returns [EObject current=null] : (this_Poner_0= rulePoner | this_Mover_1= ruleMover ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Poner_0 = null;

        EObject this_Mover_1 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:188:28: ( (this_Poner_0= rulePoner | this_Mover_1= ruleMover ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:189:1: (this_Poner_0= rulePoner | this_Mover_1= ruleMover )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:189:1: (this_Poner_0= rulePoner | this_Mover_1= ruleMover )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:190:5: this_Poner_0= rulePoner
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePoner_in_ruleCommand373);
                    this_Poner_0=rulePoner();

                    state._fsp--;

                     
                            current = this_Poner_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:200:5: this_Mover_1= ruleMover
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMover_in_ruleCommand400);
                    this_Mover_1=ruleMover();

                    state._fsp--;

                     
                            current = this_Mover_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRulePoner"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:216:1: entryRulePoner returns [EObject current=null] : iv_rulePoner= rulePoner EOF ;
    public final EObject entryRulePoner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoner = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:217:2: (iv_rulePoner= rulePoner EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:218:2: iv_rulePoner= rulePoner EOF
            {
             newCompositeNode(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner435);
            iv_rulePoner=rulePoner();

            state._fsp--;

             current =iv_rulePoner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoner"


    // $ANTLR start "rulePoner"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:225:1: rulePoner returns [EObject current=null] : ( () otherlv_1= 'Poner' otherlv_2= '(' ( (lv_color_3_0= ruleColor ) ) otherlv_4= ')' ) ;
    public final EObject rulePoner() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_color_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:228:28: ( ( () otherlv_1= 'Poner' otherlv_2= '(' ( (lv_color_3_0= ruleColor ) ) otherlv_4= ')' ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:229:1: ( () otherlv_1= 'Poner' otherlv_2= '(' ( (lv_color_3_0= ruleColor ) ) otherlv_4= ')' )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:229:1: ( () otherlv_1= 'Poner' otherlv_2= '(' ( (lv_color_3_0= ruleColor ) ) otherlv_4= ')' )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:229:2: () otherlv_1= 'Poner' otherlv_2= '(' ( (lv_color_3_0= ruleColor ) ) otherlv_4= ')'
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:229:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:230:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPonerAccess().getPonerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePoner491); 

                	newLeafNode(otherlv_1, grammarAccess.getPonerAccess().getPonerKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePoner503); 

                	newLeafNode(otherlv_2, grammarAccess.getPonerAccess().getLeftParenthesisKeyword_2());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:243:1: ( (lv_color_3_0= ruleColor ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:244:1: (lv_color_3_0= ruleColor )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:244:1: (lv_color_3_0= ruleColor )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:245:3: lv_color_3_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_rulePoner524);
            lv_color_3_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPonerRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_3_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePoner536); 

                	newLeafNode(otherlv_4, grammarAccess.getPonerAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoner"


    // $ANTLR start "entryRuleMover"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:273:1: entryRuleMover returns [EObject current=null] : iv_ruleMover= ruleMover EOF ;
    public final EObject entryRuleMover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMover = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:274:2: (iv_ruleMover= ruleMover EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:275:2: iv_ruleMover= ruleMover EOF
            {
             newCompositeNode(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover572);
            iv_ruleMover=ruleMover();

            state._fsp--;

             current =iv_ruleMover; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMover"


    // $ANTLR start "ruleMover"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:282:1: ruleMover returns [EObject current=null] : ( () otherlv_1= 'Mover' otherlv_2= '(' ( (lv_dir_3_0= ruleDireccion ) ) otherlv_4= ')' ) ;
    public final EObject ruleMover() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_dir_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:285:28: ( ( () otherlv_1= 'Mover' otherlv_2= '(' ( (lv_dir_3_0= ruleDireccion ) ) otherlv_4= ')' ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:286:1: ( () otherlv_1= 'Mover' otherlv_2= '(' ( (lv_dir_3_0= ruleDireccion ) ) otherlv_4= ')' )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:286:1: ( () otherlv_1= 'Mover' otherlv_2= '(' ( (lv_dir_3_0= ruleDireccion ) ) otherlv_4= ')' )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:286:2: () otherlv_1= 'Mover' otherlv_2= '(' ( (lv_dir_3_0= ruleDireccion ) ) otherlv_4= ')'
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:286:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:287:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoverAccess().getMoverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMover628); 

                	newLeafNode(otherlv_1, grammarAccess.getMoverAccess().getMoverKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMover640); 

                	newLeafNode(otherlv_2, grammarAccess.getMoverAccess().getLeftParenthesisKeyword_2());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:300:1: ( (lv_dir_3_0= ruleDireccion ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:301:1: (lv_dir_3_0= ruleDireccion )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:301:1: (lv_dir_3_0= ruleDireccion )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:302:3: lv_dir_3_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_ruleMover661);
            lv_dir_3_0=ruleDireccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoverRule());
            	        }
                   		set(
                   			current, 
                   			"dir",
                    		lv_dir_3_0, 
                    		"Direccion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMover673); 

                	newLeafNode(otherlv_4, grammarAccess.getMoverAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMover"


    // $ANTLR start "ruleColor"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:330:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:332:28: ( ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:333:1: ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:333:1: ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
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
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:333:2: (enumLiteral_0= 'Verde' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:333:2: (enumLiteral_0= 'Verde' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:333:4: enumLiteral_0= 'Verde'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleColor723); 

                            current = grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:339:6: (enumLiteral_1= 'Rojo' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:339:6: (enumLiteral_1= 'Rojo' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:339:8: enumLiteral_1= 'Rojo'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleColor740); 

                            current = grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:345:6: (enumLiteral_2= 'Azul' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:345:6: (enumLiteral_2= 'Azul' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:345:8: enumLiteral_2= 'Azul'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_20_in_ruleColor757); 

                            current = grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:351:6: (enumLiteral_3= 'Negro' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:351:6: (enumLiteral_3= 'Negro' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:351:8: enumLiteral_3= 'Negro'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_21_in_ruleColor774); 

                            current = grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleDireccion"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:361:1: ruleDireccion returns [Enumerator current=null] : ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) ) ;
    public final Enumerator ruleDireccion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:363:28: ( ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:364:1: ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:364:1: ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:364:2: (enumLiteral_0= 'Norte' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:364:2: (enumLiteral_0= 'Norte' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:364:4: enumLiteral_0= 'Norte'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleDireccion819); 

                            current = grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:370:6: (enumLiteral_1= 'Sur' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:370:6: (enumLiteral_1= 'Sur' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:370:8: enumLiteral_1= 'Sur'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleDireccion836); 

                            current = grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:376:6: (enumLiteral_2= 'Este' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:376:6: (enumLiteral_2= 'Este' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:376:8: enumLiteral_2= 'Este'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_24_in_ruleDireccion853); 

                            current = grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:382:6: (enumLiteral_3= 'Oeste' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:382:6: (enumLiteral_3= 'Oeste' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:382:8: enumLiteral_3= 'Oeste'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_25_in_ruleDireccion870); 

                            current = grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDireccion"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcedure212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcedure246 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleProcedure267 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_13_in_ruleProcedure280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_ruleCommand373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_ruleCommand400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePoner491 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePoner503 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleColor_in_rulePoner524 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePoner536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMover628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMover640 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleDireccion_in_ruleMover661 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMover673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleColor723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleColor740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleColor757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleColor774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDireccion819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDireccion836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDireccion853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDireccion870 = new BitSet(new long[]{0x0000000000000002L});

}