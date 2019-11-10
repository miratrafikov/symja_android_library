package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules185 { 
  public static IAST RULES = List( 
IIntegrate(3701,Integrate(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),n_DEFAULT)),Times(c_DEFAULT,Power(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),f_DEFAULT),$p("n2",true)))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(f,Power(e,CN1)),Subst(Integrate(Times(Power(Times(x,Power(f,CN1)),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Plus(Sqr(f),Sqr(x)),CN1)),x),x,Times(f,Cot(Plus(d,Times(e,x))))),x)),And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(3702,Integrate(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Integrate(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3703,Integrate(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,p),Power(c,p)),CN1),Integrate(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p)))),
IIntegrate(3704,Integrate(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Tan(Plus(d,Times(e,x))),n)),Times(c,Power(Tan(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Integrate(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3705,Integrate(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_DEFAULT),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2",true)),c_DEFAULT)),p_),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(Cot(Plus(d,Times(e,x))),n)),Times(c,Power(Cot(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1)),Integrate(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(3706,Integrate(Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_)),Times(c_DEFAULT,Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Dist(Times(g,Power(e,CN1)),Subst(Integrate(Times(Power(Times(g,x),Subtract(m,Times(C2,n,p))),Power(Plus(c,Times(b,Power(Times(g,x),n)),Times(a,Power(Times(g,x),Times(C2,n)))),p),Power(Plus(C1,Times(Sqr(g),Sqr(x))),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(g,CN1))),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n))))),
IIntegrate(3707,Integrate(Times(Power(Plus(a_DEFAULT,Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),n_),b_DEFAULT),Times(Power($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),$p("n2")),c_DEFAULT)),p_DEFAULT),Power($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(g,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Negate(Dist(Times(g,Power(e,CN1)),Subst(Integrate(Times(Power(Times(g,x),Subtract(m,Times(C2,n,p))),Power(Plus(c,Times(b,Power(Times(g,x),n)),Times(a,Power(Times(g,x),Times(C2,n)))),p),Power(Plus(C1,Times(Sqr(g),Sqr(x))),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(g,CN1))),x))),And(FreeQ(List(a,b,c,d,e,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Times(C1D2,n))))),
IIntegrate(3708,Integrate(Times(Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,n),Power(c,n)),CN1),Integrate(Times(Plus(ASymbol,Times(BSymbol,Tan(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Tan(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n)))),
IIntegrate(3709,Integrate(Times(Power(Plus(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT),a_),n_),Plus(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Dist(Power(Times(Power(C4,n),Power(c,n)),CN1),Integrate(Times(Plus(ASymbol,Times(BSymbol,Cot(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Cot(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n)))),
IIntegrate(3710,Integrate(Times(Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Tan(Plus(d,Times(e,x)))),Times(c,Sqr(Tan(Plus(d,Times(e,x)))))),n),Power(Power(Plus(b,Times(C2,c,Tan(Plus(d,Times(e,x))))),Times(C2,n)),CN1)),Integrate(Times(Plus(ASymbol,Times(BSymbol,Tan(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Tan(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(n))))),
IIntegrate(3711,Integrate(Times(Power(Plus(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT),a_),n_),Plus(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Cot(Plus(d,Times(e,x)))),Times(c,Sqr(Cot(Plus(d,Times(e,x)))))),n),Power(Power(Plus(b,Times(C2,c,Cot(Plus(d,Times(e,x))))),Times(C2,n)),CN1)),Integrate(Times(Plus(ASymbol,Times(BSymbol,Cot(Plus(d,Times(e,x))))),Power(Plus(b,Times(C2,c,Cot(Plus(d,Times(e,x))))),Times(C2,n))),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(n))))),
IIntegrate(3712,Integrate(Times(Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Plus(Dist(Plus(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Integrate(Power(Simp(Plus(b,q,Times(C2,c,Tan(Plus(d,Times(e,x))))),x),CN1),x),x),Dist(Subtract(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Integrate(Power(Simp(Plus(b,Negate(q),Times(C2,c,Tan(Plus(d,Times(e,x))))),x),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(3713,Integrate(Times(Power(Plus(a_DEFAULT,Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT)),CN1),Plus(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Plus(Dist(Plus(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Integrate(Power(Simp(Plus(b,q,Times(C2,c,Cot(Plus(d,Times(e,x))))),x),CN1),x),x),Dist(Subtract(BSymbol,Times(Subtract(Times(b,BSymbol),Times(C2,ASymbol,c)),Power(q,CN1))),Integrate(Power(Simp(Plus(b,Negate(q),Times(C2,c,Cot(Plus(d,Times(e,x))))),x),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(3714,Integrate(Times(Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),Times(c_DEFAULT,Sqr($($s("§tan"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))))),n_)),x_Symbol),
    Condition(Integrate(ExpandTrig(Times(Plus(ASymbol,Times(BSymbol,$($s("§tan"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§tan"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§tan"),Plus(d,Times(e,x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n)))),
IIntegrate(3715,Integrate(Times(Power(Plus(a_DEFAULT,Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),b_DEFAULT),Times(Sqr($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_)))),c_DEFAULT)),n_),Plus(Times($($s("§cot"),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Integrate(ExpandTrig(Times(Plus(ASymbol,Times(BSymbol,$($s("§cot"),Plus(d,Times(e,x))))),Power(Plus(a,Times(b,$($s("§cot"),Plus(d,Times(e,x)))),Times(c,Sqr($($s("§cot"),Plus(d,Times(e,x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(n)))),
IIntegrate(3716,Integrate(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§tan"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(Complex(C0,$p("fz")),f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(CI,Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),x)),Dist(Times(C2,CI),Integrate(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Power(Times(Exp(Times(C2,CI,k,Pi)),Plus(C1,Times(Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Power(Exp(Times(C2,CI,k,Pi)),CN1)))),CN1)),x),x)),And(FreeQ(List(c,d,e,f,$s("fz")),x),IntegerQ(Times(C4,k)),IGtQ(m,C0)))),
IIntegrate(3717,Integrate(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§tan"),Plus(e_DEFAULT,Times(Pi,k_DEFAULT),Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(CI,Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(C2,CI),Integrate(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(C2,CI,k,Pi)),Exp(Times(C2,CI,Plus(e,Times(f,x)))),Power(Plus(C1,Times(Exp(Times(C2,CI,k,Pi)),Exp(Times(C2,CI,Plus(e,Times(f,x)))))),CN1)),x),x)),And(FreeQ(List(c,d,e,f),x),IntegerQ(Times(C4,k)),IGtQ(m,C0)))),
IIntegrate(3718,Integrate(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§tan"),Plus(e_DEFAULT,Times(Complex(C0,$p("fz")),f_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(CI,Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),x)),Dist(Times(C2,CI),Integrate(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x)))),Power(Plus(C1,Exp(Times(C2,Plus(Times(CN1,CI,e),Times(f,$s("fz"),x))))),CN1)),x),x)),And(FreeQ(List(c,d,e,f,$s("fz")),x),IGtQ(m,C0)))),
IIntegrate(3719,Integrate(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),x_Symbol),
    Condition(Subtract(Simp(Times(CI,Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(C2,CI),Integrate(Times(Power(Plus(c,Times(d,x)),m),Exp(Times(C2,CI,Plus(e,Times(f,x)))),Power(Plus(C1,Exp(Times(C2,CI,Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(c,d,e,f),x),IGtQ(m,C0)))),
IIntegrate(3720,Integrate(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(c,Times(d,x)),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,C1)),Power(Times(f,Subtract(n,C1)),CN1)),x),Negate(Dist(Times(b,d,m,Power(Times(f,Subtract(n,C1)),CN1)),Integrate(Times(Power(Plus(c,Times(d,x)),Subtract(m,C1)),Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,C1))),x),x)),Negate(Dist(Sqr(b),Integrate(Times(Power(Plus(c,Times(d,x)),m),Power(Times(b,Tan(Plus(e,Times(f,x)))),Subtract(n,C2))),x),x))),And(FreeQ(List(b,c,d,e,f),x),GtQ(n,C1),GtQ(m,C0))))
  );
}