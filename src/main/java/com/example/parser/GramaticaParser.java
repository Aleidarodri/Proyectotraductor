// Generated from Gramatica.g4 by ANTLR 4.7.2
package com.example.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FOR=9, 
		FLOTTEUR=10, ENTIER=11, ANNULER=12, PRINCIPALE=13, NUM=14, IMPRIMER=15, 
		PAR=16, DIVISE=17, SOMME=18, SOUSTRAIRE=19, PONTENTIEL=20, VRAI=21, FAUX=22, 
		AGE=23, MINEURE=24, PLUS=25, MOINS=26, DIFF=27, EGAL=28, ET=29, OU=30, 
		MAS=31, MENOS=32, ALLER=33, STRING=34, COM=35, IGNORE=36;
	public static final int
		RULE_calculatrice = 0, RULE_ouver = 1, RULE_numflotteur = 2, RULE_numentier = 3, 
		RULE_fermet = 4, RULE_tete = 5, RULE_declaration = 6, RULE_decla = 7, 
		RULE_asignation = 8, RULE_imprimer = 9, RULE_contenu = 10, RULE_conditionalIf = 11, 
		RULE_conditionalelse = 12, RULE_conditionalelseif = 13, RULE_condicionalfor = 14, 
		RULE_condition = 15, RULE_express = 16, RULE_incremento = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculatrice", "ouver", "numflotteur", "numentier", "fermet", "tete", 
			"declaration", "decla", "asignation", "imprimer", "contenu", "conditionalIf", 
			"conditionalelse", "conditionalelseif", "condicionalfor", "condition", 
			"express", "incremento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "';'", "'}'", "'('", "')'", "'='", "'if'", "'else'", "'for'", 
			"'flotteur'", "'entier'", "'annuler'", "'principale'", null, "'imprimer'", 
			"'*'", "'/'", "'+'", "'-'", "'^'", "'true'", "'false'", "'>'", "'<'", 
			"'>='", "'<='", "'!='", "'=='", "'&&'", "'||'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "FOR", "FLOTTEUR", 
			"ENTIER", "ANNULER", "PRINCIPALE", "NUM", "IMPRIMER", "PAR", "DIVISE", 
			"SOMME", "SOUSTRAIRE", "PONTENTIEL", "VRAI", "FAUX", "AGE", "MINEURE", 
			"PLUS", "MOINS", "DIFF", "EGAL", "ET", "OU", "MAS", "MENOS", "ALLER", 
			"STRING", "COM", "IGNORE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CalculatriceContext extends ParserRuleContext {
		public CalculatriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculatrice; }
	 
		public CalculatriceContext() { }
		public void copyFrom(CalculatriceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContContext extends CalculatriceContext {
		public TeteContext tete() {
			return getRuleContext(TeteContext.class,0);
		}
		public OuverContext ouver() {
			return getRuleContext(OuverContext.class,0);
		}
		public ContenuContext contenu() {
			return getRuleContext(ContenuContext.class,0);
		}
		public FermetContext fermet() {
			return getRuleContext(FermetContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public ContContext(CalculatriceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculatriceContext calculatrice() throws RecognitionException {
		CalculatriceContext _localctx = new CalculatriceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculatrice);
		try {
			_localctx = new ContContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			tete();
			setState(37);
			ouver();
			setState(38);
			contenu();
			setState(39);
			fermet();
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OuverContext extends ParserRuleContext {
		public OuverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ouver; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOuver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuverContext ouver() throws RecognitionException {
		OuverContext _localctx = new OuverContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ouver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumflotteurContext extends ParserRuleContext {
		public TerminalNode FLOTTEUR() { return getToken(GramaticaParser.FLOTTEUR, 0); }
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public NumflotteurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numflotteur; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitNumflotteur(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final NumflotteurContext numflotteur() throws RecognitionException {
		NumflotteurContext _localctx = new NumflotteurContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numflotteur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FLOTTEUR);
			setState(45);
			match(ALLER);
			setState(46);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumentierContext extends ParserRuleContext {
		public TerminalNode ENTIER() { return getToken(GramaticaParser.ENTIER, 0); }
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public NumentierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numentier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitNumentier(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final NumentierContext numentier() throws RecognitionException {
		NumentierContext _localctx = new NumentierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numentier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ENTIER);
			setState(49);
			match(ALLER);
			setState(50);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FermetContext extends ParserRuleContext {
		public FermetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fermet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFermet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FermetContext fermet() throws RecognitionException {
		FermetContext _localctx = new FermetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fermet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TeteContext extends ParserRuleContext {
		public TerminalNode ANNULER() { return getToken(GramaticaParser.ANNULER, 0); }
		public TerminalNode PRINCIPALE() { return getToken(GramaticaParser.PRINCIPALE, 0); }
		public TeteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TeteContext tete() throws RecognitionException {
		TeteContext _localctx = new TeteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ANNULER);
			setState(55);
			match(PRINCIPALE);
			setState(56);
			match(T__3);
			setState(57);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumFlottContext extends DeclarationContext {
		public NumflotteurContext numflotteur() {
			return getRuleContext(NumflotteurContext.class,0);
		}
		public NumFlottContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumFlott(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumEntContext extends DeclarationContext {
		public NumentierContext numentier() {
			return getRuleContext(NumentierContext.class,0);
		}
		public NumEntContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumEnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOTTEUR:
				_localctx = new NumFlottContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				numflotteur();
				}
				break;
			case ENTIER:
				_localctx = new NumEntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				numentier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaContext extends ParserRuleContext {
		public DeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decla; }
	 
		public DeclaContext() { }
		public void copyFrom(DeclaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracionEntContext extends DeclaContext {
		public TerminalNode ENTIER() { return getToken(GramaticaParser.ENTIER, 0); }
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public DeclaracionEntContext(DeclaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitDeclaracionEnt(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionFlouContext extends DeclaContext {
		public TerminalNode FLOTTEUR() { return getToken(GramaticaParser.FLOTTEUR, 0); }
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public DeclaracionFlouContext(DeclaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitDeclaracionFlou(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaContext decla() throws RecognitionException {
		DeclaContext _localctx = new DeclaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decla);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOTTEUR:
				_localctx = new DeclaracionFlouContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(FLOTTEUR);
				setState(64);
				match(ALLER);
				setState(65);
				match(T__5);
				setState(66);
				express(0);
				setState(67);
				match(T__1);
				}
				break;
			case ENTIER:
				_localctx = new DeclaracionEntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(ENTIER);
				setState(70);
				match(ALLER);
				setState(71);
				match(T__5);
				setState(72);
				express(0);
				setState(73);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignationContext extends ParserRuleContext {
		public AsignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation; }
	 
		public AsignationContext() { }
		public void copyFrom(AsignationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MissionContext extends AsignationContext {
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public MissionContext(AsignationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitMission(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final AsignationContext asignation() throws RecognitionException {
		AsignationContext _localctx = new AsignationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignation);
		try {
			_localctx = new MissionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			match(ALLER);
			setState(78);
			match(T__5);
			setState(79);
			express(0);
			}
			setState(81);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimerContext extends ParserRuleContext {
		public ImprimerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimer; }
	 
		public ImprimerContext() { }
		public void copyFrom(ImprimerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprContext extends ImprimerContext {
		public TerminalNode IMPRIMER() { return getToken(GramaticaParser.IMPRIMER, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public ImprContext(ImprimerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimerContext imprimer() throws RecognitionException {
		ImprimerContext _localctx = new ImprimerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imprimer);
		try {
			_localctx = new ImprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IMPRIMER);
			setState(84);
			match(T__3);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case ALLER:
				{
				setState(85);
				express(0);
				}
				break;
			case STRING:
				{
				setState(86);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			match(T__4);
			setState(90);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenuContext extends ParserRuleContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<DeclaContext> decla() {
			return getRuleContexts(DeclaContext.class);
		}
		public DeclaContext decla(int i) {
			return getRuleContext(DeclaContext.class,i);
		}
		public List<AsignationContext> asignation() {
			return getRuleContexts(AsignationContext.class);
		}
		public AsignationContext asignation(int i) {
			return getRuleContext(AsignationContext.class,i);
		}
		public List<ImprimerContext> imprimer() {
			return getRuleContexts(ImprimerContext.class);
		}
		public ImprimerContext imprimer(int i) {
			return getRuleContext(ImprimerContext.class,i);
		}
		public List<ConditionalIfContext> conditionalIf() {
			return getRuleContexts(ConditionalIfContext.class);
		}
		public ConditionalIfContext conditionalIf(int i) {
			return getRuleContext(ConditionalIfContext.class,i);
		}
		public List<CondicionalforContext> condicionalfor() {
			return getRuleContexts(CondicionalforContext.class);
		}
		public CondicionalforContext condicionalfor(int i) {
			return getRuleContext(CondicionalforContext.class,i);
		}
		public List<IncrementoContext> incremento() {
			return getRuleContexts(IncrementoContext.class);
		}
		public IncrementoContext incremento(int i) {
			return getRuleContext(IncrementoContext.class,i);
		}
		public ContenuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenu; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitContenu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenuContext contenu() throws RecognitionException {
		ContenuContext _localctx = new ContenuContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contenu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << FOR) | (1L << FLOTTEUR) | (1L << ENTIER) | (1L << NUM) | (1L << IMPRIMER) | (1L << ALLER))) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(92);
					express(0);
					}
					break;
				case 2:
					{
					setState(93);
					declaration();
					}
					break;
				case 3:
					{
					setState(94);
					decla();
					}
					break;
				case 4:
					{
					setState(95);
					asignation();
					}
					break;
				case 5:
					{
					setState(96);
					imprimer();
					}
					break;
				case 6:
					{
					setState(97);
					conditionalIf();
					}
					break;
				case 7:
					{
					setState(98);
					condicionalfor();
					}
					break;
				case 8:
					{
					setState(99);
					incremento();
					}
					break;
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalIfContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OuverContext ouver() {
			return getRuleContext(OuverContext.class,0);
		}
		public ContenuContext contenu() {
			return getRuleContext(ContenuContext.class,0);
		}
		public FermetContext fermet() {
			return getRuleContext(FermetContext.class,0);
		}
		public List<ConditionalelseifContext> conditionalelseif() {
			return getRuleContexts(ConditionalelseifContext.class);
		}
		public ConditionalelseifContext conditionalelseif(int i) {
			return getRuleContext(ConditionalelseifContext.class,i);
		}
		public ConditionalelseContext conditionalelse() {
			return getRuleContext(ConditionalelseContext.class,0);
		}
		public ConditionalIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConditionalIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalIfContext conditionalIf() throws RecognitionException {
		ConditionalIfContext _localctx = new ConditionalIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionalIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			match(T__3);
			setState(107);
			condition(0);
			setState(108);
			match(T__4);
			setState(109);
			ouver();
			setState(110);
			contenu();
			setState(111);
			fermet();
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					conditionalelseif();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(118);
				conditionalelse();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalelseContext extends ParserRuleContext {
		public OuverContext ouver() {
			return getRuleContext(OuverContext.class,0);
		}
		public ContenuContext contenu() {
			return getRuleContext(ContenuContext.class,0);
		}
		public FermetContext fermet() {
			return getRuleContext(FermetContext.class,0);
		}
		public ConditionalelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalelse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConditionalelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalelseContext conditionalelse() throws RecognitionException {
		ConditionalelseContext _localctx = new ConditionalelseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__7);
			setState(122);
			ouver();
			setState(123);
			contenu();
			setState(124);
			fermet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalelseifContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OuverContext ouver() {
			return getRuleContext(OuverContext.class,0);
		}
		public ContenuContext contenu() {
			return getRuleContext(ContenuContext.class,0);
		}
		public FermetContext fermet() {
			return getRuleContext(FermetContext.class,0);
		}
		public ConditionalelseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalelseif; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitConditionalelseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalelseifContext conditionalelseif() throws RecognitionException {
		ConditionalelseifContext _localctx = new ConditionalelseifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalelseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(T__6);
			setState(128);
			match(T__3);
			setState(129);
			condition(0);
			setState(130);
			match(T__4);
			setState(131);
			ouver();
			setState(132);
			contenu();
			setState(133);
			fermet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public OuverContext ouver() {
			return getRuleContext(OuverContext.class,0);
		}
		public ContenuContext contenu() {
			return getRuleContext(ContenuContext.class,0);
		}
		public FermetContext fermet() {
			return getRuleContext(FermetContext.class,0);
		}
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public DeclaContext decla() {
			return getRuleContext(DeclaContext.class,0);
		}
		public CondicionalforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalfor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitCondicionalfor(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalforContext condicionalfor() throws RecognitionException {
		CondicionalforContext _localctx = new CondicionalforContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicionalfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FOR);
			setState(136);
			match(T__3);
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLER:
				{
				setState(137);
				asignation();
				}
				break;
			case FLOTTEUR:
			case ENTIER:
				{
				setState(138);
				decla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			condition(0);
			setState(142);
			match(T__1);
			setState(143);
			incremento();
			setState(144);
			match(T__4);
			setState(145);
			ouver();
			setState(146);
			contenu();
			setState(147);
			fermet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FlaseContext extends ConditionContext {
		public TerminalNode FAUX() { return getToken(GramaticaParser.FAUX, 0); }
		public FlaseContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFlase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndyorContext extends ConditionContext {
		public Token co;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode ET() { return getToken(GramaticaParser.ET, 0); }
		public TerminalNode OU() { return getToken(GramaticaParser.OU, 0); }
		public AndyorContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAndyor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ConditionContext {
		public TerminalNode VRAI() { return getToken(GramaticaParser.VRAI, 0); }
		public TrueContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ConditionContext {
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public IdContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitId(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	public static class MayMenigContext extends ConditionContext {
		public Token co;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GramaticaParser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(GramaticaParser.MOINS, 0); }
		public MayMenigContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMayMenig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifIgContext extends ConditionContext {
		public Token co;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode DIFF() { return getToken(GramaticaParser.DIFF, 0); }
		public TerminalNode EGAL() { return getToken(GramaticaParser.EGAL, 0); }
		public DifIgContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDifIg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CondicionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayMenContext extends ConditionContext {
		public Token co;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode AGE() { return getToken(GramaticaParser.AGE, 0); }
		public TerminalNode MINEURE() { return getToken(GramaticaParser.MINEURE, 0); }
		public MayMenContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMayMen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new MayMenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(150);
				express(0);
				setState(151);
				((MayMenContext)_localctx).co = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AGE || _la==MINEURE) ) {
					((MayMenContext)_localctx).co = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				express(0);
				}
				break;
			case 2:
				{
				_localctx = new MayMenigContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				express(0);
				setState(155);
				((MayMenigContext)_localctx).co = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MOINS) ) {
					((MayMenigContext)_localctx).co = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				express(0);
				}
				break;
			case 3:
				{
				_localctx = new DifIgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				express(0);
				setState(159);
				((DifIgContext)_localctx).co = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DIFF || _la==EGAL) ) {
					((DifIgContext)_localctx).co = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				express(0);
				}
				break;
			case 4:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(VRAI);
				}
				break;
			case 5:
				{
				_localctx = new FlaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(FAUX);
				}
				break;
			case 6:
				{
				_localctx = new CondicionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(T__3);
				setState(165);
				condition(0);
				setState(166);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(ALLER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndyorContext(new ConditionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(171);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(172);
					((AndyorContext)_localctx).co = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ET || _la==OU) ) {
						((AndyorContext)_localctx).co = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(173);
					condition(9);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressContext extends ParserRuleContext {
		public ExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express; }
	 
		public ExpressContext() { }
		public void copyFrom(ExpressContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PotenContext extends ExpressContext {
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public TerminalNode PONTENTIEL() { return getToken(GramaticaParser.PONTENTIEL, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public PotenContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPoten(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SoMResContext extends ExpressContext {
		public Token op;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode SOMME() { return getToken(GramaticaParser.SOMME, 0); }
		public TerminalNode SOUSTRAIRE() { return getToken(GramaticaParser.SOUSTRAIRE, 0); }
		public SoMResContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSoMRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExpressContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NumContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllerContext extends ExpressContext {
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public AllerContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitAller(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressContext {
		public Token op;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode PAR() { return getToken(GramaticaParser.PAR, 0); }
		public TerminalNode DIVISE() { return getToken(GramaticaParser.DIVISE, 0); }
		public MulDivContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressContext express() throws RecognitionException {
		return express(0);
	}

	private ExpressContext express(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressContext _localctx = new ExpressContext(_ctx, _parentState);
		ExpressContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_express, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				match(NUM);
				}
				break;
			case ALLER:
				{
				_localctx = new AllerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(ALLER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(184);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(185);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PAR || _la==DIVISE) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						express(5);
						}
						break;
					case 2:
						{
						_localctx = new SoMResContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						((SoMResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SOMME || _la==SOUSTRAIRE) ) {
							((SoMResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						express(4);
						}
						break;
					case 3:
						{
						_localctx = new PotenContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(190);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(191);
						match(PONTENTIEL);
						setState(192);
						match(NUM);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ALLER() { return getToken(GramaticaParser.ALLER, 0); }
		public TerminalNode MAS() { return getToken(GramaticaParser.MAS, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) {
				try {
					return ((GramaticaVisitor<? extends T>)visitor).visitIncremento(this);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ALLER);
			setState(199);
			match(MAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 16:
			return express_sempred((ExpressContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean express_sempred(ExpressContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b@\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\5\13Z\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\fg\n\f\f\f\16\fj\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\rt\n\r\f\r\16"+
		"\rw\13\r\3\r\5\rz\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u008e\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ac\n\21"+
		"\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21\3\22\3\22\3\22"+
		"\5\22\u00b9\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c4"+
		"\n\22\f\22\16\22\u00c7\13\22\3\23\3\23\3\23\3\23\2\4 \"\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\b\3\2\31\32\3\2\33\34\3\2\35\36\3\2"+
		"\37 \3\2\22\23\3\2\24\25\2\u00d2\2&\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\62"+
		"\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16?\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24"+
		"U\3\2\2\2\26h\3\2\2\2\30k\3\2\2\2\32{\3\2\2\2\34\u0080\3\2\2\2\36\u0089"+
		"\3\2\2\2 \u00ab\3\2\2\2\"\u00b8\3\2\2\2$\u00c8\3\2\2\2&\'\5\f\7\2\'(\5"+
		"\4\3\2()\5\26\f\2)*\5\n\6\2*+\7\2\2\3+\3\3\2\2\2,-\7\3\2\2-\5\3\2\2\2"+
		"./\7\f\2\2/\60\7#\2\2\60\61\7\4\2\2\61\7\3\2\2\2\62\63\7\r\2\2\63\64\7"+
		"#\2\2\64\65\7\4\2\2\65\t\3\2\2\2\66\67\7\5\2\2\67\13\3\2\2\289\7\16\2"+
		"\29:\7\17\2\2:;\7\6\2\2;<\7\7\2\2<\r\3\2\2\2=@\5\6\4\2>@\5\b\5\2?=\3\2"+
		"\2\2?>\3\2\2\2@\17\3\2\2\2AB\7\f\2\2BC\7#\2\2CD\7\b\2\2DE\5\"\22\2EF\7"+
		"\4\2\2FN\3\2\2\2GH\7\r\2\2HI\7#\2\2IJ\7\b\2\2JK\5\"\22\2KL\7\4\2\2LN\3"+
		"\2\2\2MA\3\2\2\2MG\3\2\2\2N\21\3\2\2\2OP\7#\2\2PQ\7\b\2\2QR\5\"\22\2R"+
		"S\3\2\2\2ST\7\4\2\2T\23\3\2\2\2UV\7\21\2\2VY\7\6\2\2WZ\5\"\22\2XZ\7$\2"+
		"\2YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\7\7\2\2\\]\7\4\2\2]\25\3\2\2\2^g\5"+
		"\"\22\2_g\5\16\b\2`g\5\20\t\2ag\5\22\n\2bg\5\24\13\2cg\5\30\r\2dg\5\36"+
		"\20\2eg\5$\23\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2\2fb\3\2\2\2fc\3"+
		"\2\2\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\27\3\2\2\2j"+
		"h\3\2\2\2kl\7\t\2\2lm\7\6\2\2mn\5 \21\2no\7\7\2\2op\5\4\3\2pq\5\26\f\2"+
		"qu\5\n\6\2rt\5\34\17\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2xz\5\32\16\2yx\3\2\2\2yz\3\2\2\2z\31\3\2\2\2{|\7\n\2\2|}\5"+
		"\4\3\2}~\5\26\f\2~\177\5\n\6\2\177\33\3\2\2\2\u0080\u0081\7\n\2\2\u0081"+
		"\u0082\7\t\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5 \21\2\u0084\u0085\7\7"+
		"\2\2\u0085\u0086\5\4\3\2\u0086\u0087\5\26\f\2\u0087\u0088\5\n\6\2\u0088"+
		"\35\3\2\2\2\u0089\u008a\7\13\2\2\u008a\u008d\7\6\2\2\u008b\u008e\5\22"+
		"\n\2\u008c\u008e\5\20\t\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\4\2\2\u0091\u0092\5$"+
		"\23\2\u0092\u0093\7\7\2\2\u0093\u0094\5\4\3\2\u0094\u0095\5\26\f\2\u0095"+
		"\u0096\5\n\6\2\u0096\37\3\2\2\2\u0097\u0098\b\21\1\2\u0098\u0099\5\"\22"+
		"\2\u0099\u009a\t\2\2\2\u009a\u009b\5\"\22\2\u009b\u00ac\3\2\2\2\u009c"+
		"\u009d\5\"\22\2\u009d\u009e\t\3\2\2\u009e\u009f\5\"\22\2\u009f\u00ac\3"+
		"\2\2\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2\t\4\2\2\u00a2\u00a3\5\"\22\2\u00a3"+
		"\u00ac\3\2\2\2\u00a4\u00ac\7\27\2\2\u00a5\u00ac\7\30\2\2\u00a6\u00a7\7"+
		"\6\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7\7\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00ac\7#\2\2\u00ab\u0097\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab\u00a0\3\2"+
		"\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00b2\3\2\2\2\u00ad\u00ae\f\n\2\2\u00ae\u00af\t\5"+
		"\2\2\u00af\u00b1\5 \21\13\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00b6\b\22\1\2\u00b6\u00b9\7\20\2\2\u00b7\u00b9\7#\2\2\u00b8\u00b5"+
		"\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00c5\3\2\2\2\u00ba\u00bb\f\6\2\2\u00bb"+
		"\u00bc\t\6\2\2\u00bc\u00c4\5\"\22\7\u00bd\u00be\f\5\2\2\u00be\u00bf\t"+
		"\7\2\2\u00bf\u00c4\5\"\22\6\u00c0\u00c1\f\7\2\2\u00c1\u00c2\7\26\2\2\u00c2"+
		"\u00c4\7\20\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"#\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7!\2\2\u00ca"+
		"%\3\2\2\2\17?MYfhuy\u008d\u00ab\u00b2\u00b8\u00c3\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}