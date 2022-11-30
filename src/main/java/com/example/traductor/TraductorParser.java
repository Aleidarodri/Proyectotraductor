// Generated from Traductor.g4 by ANTLR 4.7.2
package com.example.traductor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraductorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, FLOAT=11, INT=12, VOID=13, MAIN=14, NUM=15, IMPRIMIR=16, MUL=17, 
		DIV=18, SUMA=19, RESTA=20, PONTENCIA=21, TRUE=22, FALSE=23, MAYOR=24, 
		MENOR=25, MAYORIG=26, MENORIG=27, DIF=28, IGUAL=29, AND=30, OR=31, ID=32, 
		STRING=33, COM=34, WS=35;
	public static final int
		RULE_calculadora = 0, RULE_abrirll = 1, RULE_numfloat = 2, RULE_numInt = 3, 
		RULE_cll = 4, RULE_cabeza = 5, RULE_declaracion = 6, RULE_decla = 7, RULE_asignacion = 8, 
		RULE_impresion = 9, RULE_contenido = 10, RULE_condicionalIf = 11, RULE_condicionalelse = 12, 
		RULE_condicionalelseif = 13, RULE_condicionalfor = 14, RULE_condicion = 15, 
		RULE_express = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculadora", "abrirll", "numfloat", "numInt", "cll", "cabeza", "declaracion", 
			"decla", "asignacion", "impresion", "contenido", "condicionalIf", "condicionalelse", 
			"condicionalelseif", "condicionalfor", "condicion", "express"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "';'", "'}'", "'('", "')'", "'='", "'if'", "'else'", "'++'", 
			"'--'", "'float'", "'int'", "'void'", "'main'", null, "'printf'", "'*'", 
			"'/'", "'+'", "'-'", "'^'", "'true'", "'false'", "'>'", "'<'", "'>='", 
			"'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "FLOAT", 
			"INT", "VOID", "MAIN", "NUM", "IMPRIMIR", "MUL", "DIV", "SUMA", "RESTA", 
			"PONTENCIA", "TRUE", "FALSE", "MAYOR", "MENOR", "MAYORIG", "MENORIG", 
			"DIF", "IGUAL", "AND", "OR", "ID", "STRING", "COM", "WS"
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
	public String getGrammarFileName() { return "Traductor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TraductorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CalculadoraContext extends ParserRuleContext {
		public CalculadoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculadora; }
	 
		public CalculadoraContext() { }
		public void copyFrom(CalculadoraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContContext extends CalculadoraContext {
		public CabezaContext cabeza() {
			return getRuleContext(CabezaContext.class,0);
		}
		public AbrirllContext abrirll() {
			return getRuleContext(AbrirllContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CllContext cll() {
			return getRuleContext(CllContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TraductorParser.EOF, 0); }
		public ContContext(CalculadoraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculadoraContext calculadora() throws RecognitionException {
		CalculadoraContext _localctx = new CalculadoraContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculadora);
		try {
			_localctx = new ContContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			cabeza();
			setState(35);
			abrirll();
			setState(36);
			contenido();
			setState(37);
			cll();
			setState(38);
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

	public static class AbrirllContext extends ParserRuleContext {
		public AbrirllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abrirll; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitAbrirll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbrirllContext abrirll() throws RecognitionException {
		AbrirllContext _localctx = new AbrirllContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abrirll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
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

	public static class NumfloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(TraductorParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(TraductorParser.ID, 0); }
		public NumfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numfloat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitNumfloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumfloatContext numfloat() throws RecognitionException {
		NumfloatContext _localctx = new NumfloatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FLOAT);
			setState(43);
			match(ID);
			setState(44);
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

	public static class NumIntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TraductorParser.INT, 0); }
		public TerminalNode ID() { return getToken(TraductorParser.ID, 0); }
		public NumIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitNumInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumIntContext numInt() throws RecognitionException {
		NumIntContext _localctx = new NumIntContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(INT);
			setState(47);
			match(ID);
			setState(48);
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

	public static class CllContext extends ParserRuleContext {
		public CllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cll; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CllContext cll() throws RecognitionException {
		CllContext _localctx = new CllContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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

	public static class CabezaContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(TraductorParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(TraductorParser.MAIN, 0); }
		public CabezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabeza; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCabeza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabezaContext cabeza() throws RecognitionException {
		CabezaContext _localctx = new CabezaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cabeza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(VOID);
			setState(53);
			match(MAIN);
			setState(54);
			match(T__3);
			setState(55);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	 
		public DeclaracionContext() { }
		public void copyFrom(DeclaracionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumflotContext extends DeclaracionContext {
		public NumfloatContext numfloat() {
			return getRuleContext(NumfloatContext.class,0);
		}
		public NumflotContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitNumflot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NuminContext extends DeclaracionContext {
		public NumIntContext numInt() {
			return getRuleContext(NumIntContext.class,0);
		}
		public NuminContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitNumin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NuminContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				numInt();
				}
				break;
			case FLOAT:
				_localctx = new NumflotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				numfloat();
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
	public static class DeclaracionIntContext extends DeclaContext {
		public TerminalNode INT() { return getToken(TraductorParser.INT, 0); }
		public TerminalNode ID() { return getToken(TraductorParser.ID, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public DeclaracionIntContext(DeclaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitDeclaracionInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionFloatContext extends DeclaContext {
		public TerminalNode FLOAT() { return getToken(TraductorParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(TraductorParser.ID, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public DeclaracionFloatContext(DeclaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitDeclaracionFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaContext decla() throws RecognitionException {
		DeclaContext _localctx = new DeclaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decla);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new DeclaracionFloatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(FLOAT);
				setState(62);
				match(ID);
				setState(63);
				match(T__5);
				setState(64);
				express(0);
				setState(65);
				match(T__1);
				}
				break;
			case INT:
				_localctx = new DeclaracionIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(INT);
				setState(68);
				match(ID);
				setState(69);
				match(T__5);
				setState(70);
				express(0);
				setState(71);
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsigContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(TraductorParser.ID, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public AsigContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			_localctx = new AsigContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75);
			match(ID);
			setState(76);
			match(T__5);
			setState(77);
			express(0);
			}
			setState(79);
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

	public static class ImpresionContext extends ParserRuleContext {
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	 
		public ImpresionContext() { }
		public void copyFrom(ImpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprContext extends ImpresionContext {
		public TerminalNode IMPRIMIR() { return getToken(TraductorParser.IMPRIMIR, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TraductorParser.STRING, 0); }
		public ImprContext(ImpresionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitImpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_impresion);
		try {
			_localctx = new ImprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IMPRIMIR);
			setState(82);
			match(T__3);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case ID:
				{
				setState(83);
				express(0);
				}
				break;
			case STRING:
				{
				setState(84);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			match(T__4);
			setState(88);
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

	public static class ContenidoContext extends ParserRuleContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<DeclaContext> decla() {
			return getRuleContexts(DeclaContext.class);
		}
		public DeclaContext decla(int i) {
			return getRuleContext(DeclaContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<ImpresionContext> impresion() {
			return getRuleContexts(ImpresionContext.class);
		}
		public ImpresionContext impresion(int i) {
			return getRuleContext(ImpresionContext.class,i);
		}
		public List<CondicionalIfContext> condicionalIf() {
			return getRuleContexts(CondicionalIfContext.class);
		}
		public CondicionalIfContext condicionalIf(int i) {
			return getRuleContext(CondicionalIfContext.class,i);
		}
		public List<CondicionalforContext> condicionalfor() {
			return getRuleContexts(CondicionalforContext.class);
		}
		public CondicionalforContext condicionalfor(int i) {
			return getRuleContext(CondicionalforContext.class,i);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contenido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << FLOAT) | (1L << INT) | (1L << NUM) | (1L << IMPRIMIR) | (1L << ID))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(90);
					express(0);
					}
					break;
				case 2:
					{
					setState(91);
					declaracion();
					}
					break;
				case 3:
					{
					setState(92);
					decla();
					}
					break;
				case 4:
					{
					setState(93);
					asignacion();
					}
					break;
				case 5:
					{
					setState(94);
					impresion();
					}
					break;
				case 6:
					{
					setState(95);
					condicionalIf();
					}
					break;
				case 7:
					{
					setState(96);
					condicionalfor();
					}
					break;
				}
				}
				setState(101);
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

	public static class CondicionalIfContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public AbrirllContext abrirll() {
			return getRuleContext(AbrirllContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CllContext cll() {
			return getRuleContext(CllContext.class,0);
		}
		public List<CondicionalelseifContext> condicionalelseif() {
			return getRuleContexts(CondicionalelseifContext.class);
		}
		public CondicionalelseifContext condicionalelseif(int i) {
			return getRuleContext(CondicionalelseifContext.class,i);
		}
		public CondicionalelseContext condicionalelse() {
			return getRuleContext(CondicionalelseContext.class,0);
		}
		public CondicionalIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCondicionalIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalIfContext condicionalIf() throws RecognitionException {
		CondicionalIfContext _localctx = new CondicionalIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicionalIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__6);
			setState(103);
			match(T__3);
			setState(104);
			condicion(0);
			setState(105);
			match(T__4);
			setState(106);
			abrirll();
			setState(107);
			contenido();
			setState(108);
			cll();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					condicionalelseif();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(115);
				condicionalelse();
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

	public static class CondicionalelseContext extends ParserRuleContext {
		public AbrirllContext abrirll() {
			return getRuleContext(AbrirllContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CllContext cll() {
			return getRuleContext(CllContext.class,0);
		}
		public CondicionalelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalelse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCondicionalelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalelseContext condicionalelse() throws RecognitionException {
		CondicionalelseContext _localctx = new CondicionalelseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicionalelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__7);
			setState(119);
			abrirll();
			setState(120);
			contenido();
			setState(121);
			cll();
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

	public static class CondicionalelseifContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public AbrirllContext abrirll() {
			return getRuleContext(AbrirllContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CllContext cll() {
			return getRuleContext(CllContext.class,0);
		}
		public CondicionalelseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalelseif; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCondicionalelseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalelseifContext condicionalelseif() throws RecognitionException {
		CondicionalelseifContext _localctx = new CondicionalelseifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicionalelseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__7);
			setState(124);
			match(T__6);
			setState(125);
			match(T__3);
			setState(126);
			condicion(0);
			setState(127);
			match(T__4);
			setState(128);
			abrirll();
			setState(129);
			contenido();
			setState(130);
			cll();
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
		public Token op;
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TraductorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TraductorParser.ID, i);
		}
		public AbrirllContext abrirll() {
			return getRuleContext(AbrirllContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CllContext cll() {
			return getRuleContext(CllContext.class,0);
		}
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public TerminalNode INT() { return getToken(TraductorParser.INT, 0); }
		public CondicionalforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalfor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCondicionalfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalforContext condicionalfor() throws RecognitionException {
		CondicionalforContext _localctx = new CondicionalforContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicionalfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__3);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(133);
				match(ID);
				setState(134);
				match(T__5);
				setState(135);
				express(0);
				}
				break;
			case INT:
				{
				setState(136);
				match(INT);
				setState(137);
				match(ID);
				setState(138);
				match(T__5);
				setState(139);
				express(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			match(T__1);
			setState(143);
			condicion(0);
			setState(144);
			match(T__1);
			setState(145);
			match(ID);
			setState(146);
			((CondicionalforContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
				((CondicionalforContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			match(T__4);
			setState(148);
			abrirll();
			setState(149);
			contenido();
			setState(150);
			cll();
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

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicContext extends CondicionContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CondicContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitCondic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndyorContext extends CondicionContext {
		public Token co;
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TraductorParser.AND, 0); }
		public TerminalNode OR() { return getToken(TraductorParser.OR, 0); }
		public AndyorContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitAndyor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends CondicionContext {
		public TerminalNode TRUE() { return getToken(TraductorParser.TRUE, 0); }
		public TrueContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends CondicionContext {
		public TerminalNode FALSE() { return getToken(TraductorParser.FALSE, 0); }
		public FalseContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends CondicionContext {
		public TerminalNode ID() { return getToken(TraductorParser.ID, 0); }
		public VariableContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayMenigContext extends CondicionContext {
		public Token co;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode MAYORIG() { return getToken(TraductorParser.MAYORIG, 0); }
		public TerminalNode MENORIG() { return getToken(TraductorParser.MENORIG, 0); }
		public MayMenigContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitMayMenig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifIgContext extends CondicionContext {
		public Token co;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode DIF() { return getToken(TraductorParser.DIF, 0); }
		public TerminalNode IGUAL() { return getToken(TraductorParser.IGUAL, 0); }
		public DifIgContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitDifIg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayMenContext extends CondicionContext {
		public Token co;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(TraductorParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(TraductorParser.MENOR, 0); }
		public MayMenContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitMayMen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new MayMenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				express(0);
				setState(154);
				((MayMenContext)_localctx).co = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAYOR || _la==MENOR) ) {
					((MayMenContext)_localctx).co = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				express(0);
				}
				break;
			case 2:
				{
				_localctx = new MayMenigContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				express(0);
				setState(158);
				((MayMenigContext)_localctx).co = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAYORIG || _la==MENORIG) ) {
					((MayMenigContext)_localctx).co = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				express(0);
				}
				break;
			case 3:
				{
				_localctx = new DifIgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				express(0);
				setState(162);
				((DifIgContext)_localctx).co = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DIF || _la==IGUAL) ) {
					((DifIgContext)_localctx).co = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				express(0);
				}
				break;
			case 4:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(FALSE);
				}
				break;
			case 6:
				{
				_localctx = new CondicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__3);
				setState(168);
				condicion(0);
				setState(169);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndyorContext(new CondicionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(174);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(175);
					((AndyorContext)_localctx).co = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((AndyorContext)_localctx).co = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(176);
					condicion(9);
					}
					} 
				}
				setState(181);
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
		public TerminalNode PONTENCIA() { return getToken(TraductorParser.PONTENCIA, 0); }
		public TerminalNode NUM() { return getToken(TraductorParser.NUM, 0); }
		public PotenContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitPoten(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExpressContext {
		public TerminalNode NUM() { return getToken(TraductorParser.NUM, 0); }
		public NumContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuMResContext extends ExpressContext {
		public Token op;
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(TraductorParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(TraductorParser.RESTA, 0); }
		public SuMResContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitSuMRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressContext {
		public TerminalNode ID() { return getToken(TraductorParser.ID, 0); }
		public IdContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitId(this);
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
		public TerminalNode MUL() { return getToken(TraductorParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TraductorParser.DIV, 0); }
		public MulDivContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorVisitor ) return ((TraductorVisitor<? extends T>)visitor).visitMulDiv(this);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(187);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(188);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						express(5);
						}
						break;
					case 2:
						{
						_localctx = new SuMResContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						((SuMResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
							((SuMResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						express(4);
						}
						break;
					case 3:
						{
						_localctx = new PotenContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						match(PONTENCIA);
						setState(195);
						match(NUM);
						}
						break;
					}
					} 
				}
				setState(200);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 16:
			return express_sempred((ExpressContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\5\13X\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fd\n\f\f\f\16"+
		"\fg\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\rq\n\r\f\r\16\rt\13\r\3\r\5"+
		"\rw\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008f\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00af\n\21\3\21\3\21\3\21\7\21\u00b4\n\21\f\21\16\21\u00b7"+
		"\13\21\3\22\3\22\3\22\5\22\u00bc\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00c7\n\22\f\22\16\22\u00ca\13\22\3\22\2\4 \"\23\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\t\3\2\13\f\3\2\32\33\3\2\34"+
		"\35\3\2\36\37\3\2 !\3\2\23\24\3\2\25\26\2\u00d2\2$\3\2\2\2\4*\3\2\2\2"+
		"\6,\3\2\2\2\b\60\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16=\3\2\2\2\20K\3\2"+
		"\2\2\22M\3\2\2\2\24S\3\2\2\2\26e\3\2\2\2\30h\3\2\2\2\32x\3\2\2\2\34}\3"+
		"\2\2\2\36\u0086\3\2\2\2 \u00ae\3\2\2\2\"\u00bb\3\2\2\2$%\5\f\7\2%&\5\4"+
		"\3\2&\'\5\26\f\2\'(\5\n\6\2()\7\2\2\3)\3\3\2\2\2*+\7\3\2\2+\5\3\2\2\2"+
		",-\7\r\2\2-.\7\"\2\2./\7\4\2\2/\7\3\2\2\2\60\61\7\16\2\2\61\62\7\"\2\2"+
		"\62\63\7\4\2\2\63\t\3\2\2\2\64\65\7\5\2\2\65\13\3\2\2\2\66\67\7\17\2\2"+
		"\678\7\20\2\289\7\6\2\29:\7\7\2\2:\r\3\2\2\2;>\5\b\5\2<>\5\6\4\2=;\3\2"+
		"\2\2=<\3\2\2\2>\17\3\2\2\2?@\7\r\2\2@A\7\"\2\2AB\7\b\2\2BC\5\"\22\2CD"+
		"\7\4\2\2DL\3\2\2\2EF\7\16\2\2FG\7\"\2\2GH\7\b\2\2HI\5\"\22\2IJ\7\4\2\2"+
		"JL\3\2\2\2K?\3\2\2\2KE\3\2\2\2L\21\3\2\2\2MN\7\"\2\2NO\7\b\2\2OP\5\"\22"+
		"\2PQ\3\2\2\2QR\7\4\2\2R\23\3\2\2\2ST\7\22\2\2TW\7\6\2\2UX\5\"\22\2VX\7"+
		"#\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7\7\2\2Z[\7\4\2\2[\25\3\2\2\2\\"+
		"d\5\"\22\2]d\5\16\b\2^d\5\20\t\2_d\5\22\n\2`d\5\24\13\2ad\5\30\r\2bd\5"+
		"\36\20\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2"+
		"cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\27\3\2\2\2ge\3\2\2\2hi\7\t\2"+
		"\2ij\7\6\2\2jk\5 \21\2kl\7\7\2\2lm\5\4\3\2mn\5\26\f\2nr\5\n\6\2oq\5\34"+
		"\17\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uw\5"+
		"\32\16\2vu\3\2\2\2vw\3\2\2\2w\31\3\2\2\2xy\7\n\2\2yz\5\4\3\2z{\5\26\f"+
		"\2{|\5\n\6\2|\33\3\2\2\2}~\7\n\2\2~\177\7\t\2\2\177\u0080\7\6\2\2\u0080"+
		"\u0081\5 \21\2\u0081\u0082\7\7\2\2\u0082\u0083\5\4\3\2\u0083\u0084\5\26"+
		"\f\2\u0084\u0085\5\n\6\2\u0085\35\3\2\2\2\u0086\u008e\7\6\2\2\u0087\u0088"+
		"\7\"\2\2\u0088\u0089\7\b\2\2\u0089\u008f\5\"\22\2\u008a\u008b\7\16\2\2"+
		"\u008b\u008c\7\"\2\2\u008c\u008d\7\b\2\2\u008d\u008f\5\"\22\2\u008e\u0087"+
		"\3\2\2\2\u008e\u008a\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\4\2\2\u0091"+
		"\u0092\5 \21\2\u0092\u0093\7\4\2\2\u0093\u0094\7\"\2\2\u0094\u0095\t\2"+
		"\2\2\u0095\u0096\7\7\2\2\u0096\u0097\5\4\3\2\u0097\u0098\5\26\f\2\u0098"+
		"\u0099\5\n\6\2\u0099\37\3\2\2\2\u009a\u009b\b\21\1\2\u009b\u009c\5\"\22"+
		"\2\u009c\u009d\t\3\2\2\u009d\u009e\5\"\22\2\u009e\u00af\3\2\2\2\u009f"+
		"\u00a0\5\"\22\2\u00a0\u00a1\t\4\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00af\3"+
		"\2\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5\t\5\2\2\u00a5\u00a6\5\"\22\2\u00a6"+
		"\u00af\3\2\2\2\u00a7\u00af\7\30\2\2\u00a8\u00af\7\31\2\2\u00a9\u00aa\7"+
		"\6\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7\7\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00af\7\"\2\2\u00ae\u009a\3\2\2\2\u00ae\u009f\3\2\2\2\u00ae\u00a3\3\2"+
		"\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b5\3\2\2\2\u00b0\u00b1\f\n\2\2\u00b1\u00b2\t\6"+
		"\2\2\u00b2\u00b4\5 \21\13\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b8\u00b9\b\22\1\2\u00b9\u00bc\7\21\2\2\u00ba\u00bc\7\"\2\2\u00bb\u00b8"+
		"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00c8\3\2\2\2\u00bd\u00be\f\6\2\2\u00be"+
		"\u00bf\t\7\2\2\u00bf\u00c7\5\"\22\7\u00c0\u00c1\f\5\2\2\u00c1\u00c2\t"+
		"\b\2\2\u00c2\u00c7\5\"\22\6\u00c3\u00c4\f\7\2\2\u00c4\u00c5\7\27\2\2\u00c5"+
		"\u00c7\7\21\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"#\3\2\2\2\u00ca\u00c8\3\2\2\2\17=KWcerv\u008e\u00ae\u00b5\u00bb\u00c6"+
		"\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}