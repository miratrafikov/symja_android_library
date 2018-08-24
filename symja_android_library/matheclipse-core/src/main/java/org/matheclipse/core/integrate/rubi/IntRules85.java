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
public class IntRules85 { 
  public static IAST RULES = List( 
IIntegrate(4251,Int(Times(Plus(A_DEFAULT,Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT)),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(BSymbol,Tan(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Tan(Plus(a,Times(b,x)))))),Power(Tan(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol),x),KnownTangentIntegrandQ(u,x)))),
IIntegrate(4252,Int(Times(u_,Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(BSymbol,Cot(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Cot(Plus(a,Times(b,x)))))),Power(Cot(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol),x),KnownCotangentIntegrandQ(u,x)))),
IIntegrate(4253,Int(Times(Plus(Times(Sqr($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT),A_),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(ASymbol,Sqr(Tan(Plus(a,Times(b,x)))))),Power(Tan(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,CSymbol),x),KnownTangentIntegrandQ(u,x)))),
IIntegrate(4254,Int(Times(u_,Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(ASymbol,Sqr(Cot(Plus(a,Times(b,x)))))),Power(Cot(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,CSymbol),x),KnownCotangentIntegrandQ(u,x)))),
IIntegrate(4255,Int(Times(u_,Plus(A_DEFAULT,Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),C_DEFAULT),Times(B_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(ASymbol,Tan(Plus(a,Times(b,x)))),Times(BSymbol,Sqr(Tan(Plus(a,Times(b,x)))))),Power(Tan(Plus(a,Times(b,x))),-1)),x),FreeQ(List(a,b,ASymbol,BSymbol,CSymbol),x))),
IIntegrate(4256,Int(Times(u_,Plus(Times(A_DEFAULT,Power($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),Times(B_DEFAULT,Power($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n1"))),Times(C_DEFAULT,Power($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n2"))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Tan(Plus(a,Times(b,x))),n),Plus(ASymbol,Times(BSymbol,Tan(Plus(a,Times(b,x)))),Times(CSymbol,Sqr(Tan(Plus(a,Times(b,x))))))),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol,n),x),EqQ($s("n1"),Plus(n,C1)),EqQ($s("n2"),Plus(n,C2))))),
IIntegrate(4257,Int(Times(Plus(Times(Power($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),A_DEFAULT),Times(Power($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n1")),B_DEFAULT),Times(Power($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n2")),C_DEFAULT)),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Cot(Plus(a,Times(b,x))),n),Plus(ASymbol,Times(BSymbol,Cot(Plus(a,Times(b,x)))),Times(CSymbol,Sqr(Cot(Plus(a,Times(b,x))))))),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol,n),x),EqQ($s("n1"),Plus(n,C1)),EqQ($s("n2"),Plus(n,C2))))),
IIntegrate(4258,Int(Times(Power(Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),u_,Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(d,Csc(Plus(a,Times(b,x)))),m)),Int(Times(ActivateTrig(u),Power(Times(d,Csc(Plus(a,Times(b,x)))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4259,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),m_DEFAULT),u_,Power(Times(d_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(d,Sec(Plus(a,Times(b,x)))),m)),Int(Times(ActivateTrig(u),Power(Times(d,Sec(Plus(a,Times(b,x)))),Plus(n,Negate(m)))),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4260,Int(Times(u_,Power(Times(d_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Tan(Plus(a,Times(b,x)))),m),Power(Times(d,Csc(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Sec(Plus(a,Times(b,x)))),m),-1)),Int(Times(ActivateTrig(u),Power(Times(d,Sec(Plus(a,Times(b,x)))),Plus(m,n)),Power(Power(Times(d,Csc(Plus(a,Times(b,x)))),m),-1)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownSecantIntegrandQ(u,x),Not(IntegerQ(m))))),
IIntegrate(4261,Int(Times(Power(Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),u_,Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Tan(Plus(a,Times(b,x)))),m),Power(Times(d,Csc(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Sec(Plus(a,Times(b,x)))),m),-1)),Int(Times(ActivateTrig(u),Power(Times(d,Sec(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Csc(Plus(a,Times(b,x)))),Plus(m,Negate(n))),-1)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownSecantIntegrandQ(u,x),Not(IntegerQ(m))))),
IIntegrate(4262,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),m_DEFAULT),u_,Power(Times(d_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cot(Plus(a,Times(b,x)))),m),Power(Times(d,Sec(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Csc(Plus(a,Times(b,x)))),m),-1)),Int(Times(ActivateTrig(u),Power(Times(d,Csc(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Sec(Plus(a,Times(b,x)))),Plus(m,Negate(n))),-1)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownSecantIntegrandQ(u,x),Not(IntegerQ(m))))),
IIntegrate(4263,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),m_DEFAULT),Power(Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),u_),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cot(Plus(a,Times(b,x)))),m),Power(Times(d,Sec(Plus(a,Times(b,x)))),m),Power(Power(Times(d,Csc(Plus(a,Times(b,x)))),m),-1)),Int(Times(ActivateTrig(u),Power(Times(d,Csc(Plus(a,Times(b,x)))),Plus(m,n)),Power(Power(Times(d,Sec(Plus(a,Times(b,x)))),m),-1)),x),x),And(FreeQ(List(a,b,c,d,m,n),x),KnownSecantIntegrandQ(u,x),Not(IntegerQ(m))))),
IIntegrate(4264,Int(Times(u_,Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(c,Sin(Plus(a,Times(b,x)))),m)),Int(Times(ActivateTrig(u),Power(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),-1)),x),x),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(m)),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4265,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),m_DEFAULT),u_),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(c,Sec(Plus(a,Times(b,x)))),m)),Int(Times(ActivateTrig(u),Power(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),-1)),x),x),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(m)),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4266,Int(Times(u_,Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Tan(Plus(a,Times(b,x)))),m),Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),-1)),Int(Times(ActivateTrig(u),Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),-1)),x),x),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(m)),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4267,Int(Times(Power(Times($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),m_DEFAULT),u_),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Cot(Plus(a,Times(b,x)))),m),Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),-1)),Int(Times(ActivateTrig(u),Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),-1)),x),x),And(FreeQ(List(a,b,c,m),x),Not(IntegerQ(m)),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4268,Int(Times(Plus(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),A_),u_,Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(c,Int(Times(ActivateTrig(u),Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Plus(BSymbol,Times(ASymbol,Sec(Plus(a,Times(b,x)))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4269,Int(Times(Power(Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_,Plus(A_,Times(B_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Dist(c,Int(Times(ActivateTrig(u),Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Plus(BSymbol,Times(ASymbol,Csc(Plus(a,Times(b,x)))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4270,Int(Times(Plus(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),A_),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(BSymbol,Times(ASymbol,Sec(Plus(a,Times(b,x))))),Power(Sec(Plus(a,Times(b,x))),-1)),x),And(FreeQ(List(a,b,ASymbol,BSymbol),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4271,Int(Times(u_,Plus(A_,Times(B_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(BSymbol,Times(ASymbol,Csc(Plus(a,Times(b,x))))),Power(Csc(Plus(a,Times(b,x))),-1)),x),And(FreeQ(List(a,b,ASymbol,BSymbol),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4272,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT)),u_DEFAULT,Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(n,Negate(C2))),Plus(CSymbol,Times(BSymbol,Sec(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Sec(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,CSymbol,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4273,Int(Times(Power(Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_DEFAULT,Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(n,Negate(C2))),Plus(CSymbol,Times(BSymbol,Csc(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Csc(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,BSymbol,CSymbol,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4274,Int(Times(u_DEFAULT,Plus(Times(Sqr($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT),A_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(n,Negate(C2))),Plus(CSymbol,Times(ASymbol,Sqr(Sec(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,CSymbol,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4275,Int(Times(Power(Times($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),c_DEFAULT),n_DEFAULT),u_DEFAULT,Plus(A_,Times(C_DEFAULT,Sqr($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Sqr(c),Int(Times(ActivateTrig(u),Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(n,Negate(C2))),Plus(CSymbol,Times(ASymbol,Sqr(Csc(Plus(a,Times(b,x))))))),x),x),And(FreeQ(List(a,b,c,ASymbol,CSymbol,n),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4276,Int(Times(Plus(A_DEFAULT,Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),B_DEFAULT),Times(Sqr($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT)),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(BSymbol,Sec(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Sec(Plus(a,Times(b,x)))))),Power(Sec(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4277,Int(Times(u_,Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(BSymbol,Csc(Plus(a,Times(b,x)))),Times(ASymbol,Sqr(Csc(Plus(a,Times(b,x)))))),Power(Csc(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4278,Int(Times(Plus(Times(Sqr($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),C_DEFAULT),A_),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(ASymbol,Sqr(Sec(Plus(a,Times(b,x)))))),Power(Sec(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,CSymbol),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4279,Int(Times(u_,Plus(A_,Times(C_DEFAULT,Sqr($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Plus(CSymbol,Times(ASymbol,Sqr(Csc(Plus(a,Times(b,x)))))),Power(Csc(Plus(a,Times(b,x))),-2)),x),And(FreeQ(List(a,b,ASymbol,CSymbol),x),KnownSecantIntegrandQ(u,x)))),
IIntegrate(4280,Int(Times(u_,Plus(Times(A_DEFAULT,Power($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),Times(B_DEFAULT,Power($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n1"))),Times(C_DEFAULT,Power($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n2"))))),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Sec(Plus(a,Times(b,x))),n),Plus(ASymbol,Times(BSymbol,Sec(Plus(a,Times(b,x)))),Times(CSymbol,Sqr(Sec(Plus(a,Times(b,x))))))),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol,n),x),EqQ($s("n1"),Plus(n,C1)),EqQ($s("n2"),Plus(n,C2))))),
IIntegrate(4281,Int(Times(Plus(Times(Power($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),A_DEFAULT),Times(Power($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n1")),B_DEFAULT),Times(Power($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$p("n2")),C_DEFAULT)),u_),x_Symbol),
    Condition(Int(Times(ActivateTrig(u),Power(Csc(Plus(a,Times(b,x))),n),Plus(ASymbol,Times(BSymbol,Csc(Plus(a,Times(b,x)))),Times(CSymbol,Sqr(Csc(Plus(a,Times(b,x))))))),x),And(FreeQ(List(a,b,ASymbol,BSymbol,CSymbol,n),x),EqQ($s("n1"),Plus(n,C1)),EqQ($s("n2"),Plus(n,C2))))),
IIntegrate(4282,Int(Times($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Sin(Plus(a,Negate(c),Times(Plus(b,Negate(d)),x))),Power(Times(C2,Plus(b,Negate(d))),-1)),x),Negate(Simp(Times(Sin(Plus(a,c,Times(Plus(b,d),x))),Power(Times(C2,Plus(b,d)),-1)),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(b),Negate(Sqr(d))),C0)))),
IIntegrate(4283,Int(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Sin(Plus(a,Negate(c),Times(Plus(b,Negate(d)),x))),Power(Times(C2,Plus(b,Negate(d))),-1)),x),Simp(Times(Sin(Plus(a,c,Times(Plus(b,d),x))),Power(Times(C2,Plus(b,d)),-1)),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(b),Negate(Sqr(d))),C0)))),
IIntegrate(4284,Int(Times($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(a,Negate(c),Times(Plus(b,Negate(d)),x))),Power(Times(C2,Plus(b,Negate(d))),-1)),x)),Negate(Simp(Times(Cos(Plus(a,c,Times(Plus(b,d),x))),Power(Times(C2,Plus(b,d)),-1)),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(b),Negate(Sqr(d))),C0)))),
IIntegrate(4285,Int(Times(Sqr($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),x),x),Dist(C1D2,Int(Times(Cos(Plus(c,Times(d,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,g),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),IGtQ(Times(C1D2,p),C0)))),
IIntegrate(4286,Int(Times(Sqr($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),x),x),Negate(Dist(C1D2,Int(Times(Cos(Plus(c,Times(d,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x))),And(FreeQ(List(a,b,c,d,g),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),IGtQ(Times(C1D2,p),C0)))),
IIntegrate(4287,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_DEFAULT),Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(C2,p),Power(Power(e,p),-1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,p)),Power(Sin(Plus(a,Times(b,x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),IntegerQ(p)))),
IIntegrate(4288,Int(Times(Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(C2,p),Power(Power(f,p),-1)),Int(Times(Power(Cos(Plus(a,Times(b,x))),p),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,p))),x),x),And(FreeQ(List(a,b,c,d,f,n),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),IntegerQ(p)))),
IIntegrate(4289,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Simp(Times(Sqr(e),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,g,m,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),EqQ(Plus(m,p,Negate(C1)),C0)))),
IIntegrate(4290,Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Negate(Simp(Times(Sqr(e),Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e,g,m,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),EqQ(Plus(m,p,Negate(C1)),C0)))),
IIntegrate(4291,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Negate(Simp(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(b,g,m),-1)),x)),And(FreeQ(List(a,b,c,d,e,g,m,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),EqQ(Plus(m,Times(C2,p),C2),C0)))),
IIntegrate(4292,Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Simp(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(b,g,m),-1)),x),And(FreeQ(List(a,b,c,d,e,g,m,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),EqQ(Plus(m,Times(C2,p),C2),C0)))),
IIntegrate(4293,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(e),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),x),Dist(Times(Power(e,4),Plus(m,p,Negate(C1)),Power(Times(C4,Sqr(g),Plus(p,C1)),-1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C4))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x),x)),And(FreeQ(List(a,b,c,d,e,g),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),GtQ(m,C2),LtQ(p,CN1),Or(GtQ(m,C3),EqQ(p,QQ(-3L,2L))),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(4294,Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(e),Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),x)),Dist(Times(Power(e,4),Plus(m,p,Negate(C1)),Power(Times(C4,Sqr(g),Plus(p,C1)),-1)),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C4))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x),x)),And(FreeQ(List(a,b,c,d,e,g),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),GtQ(m,C2),LtQ(p,CN1),Or(GtQ(m,C3),EqQ(p,QQ(-3L,2L))),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(4295,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),x),Dist(Times(Sqr(e),Plus(m,Times(C2,p),C2),Power(Times(C4,Sqr(g),Plus(p,C1)),-1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x),x)),And(FreeQ(List(a,b,c,d,e,g),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),GtQ(m,C1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,p),C2),C0),Or(LtQ(p,CN2),EqQ(m,C2)),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(4296,Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),x)),Dist(Times(Sqr(e),Plus(m,Times(C2,p),C2),Power(Times(C4,Sqr(g),Plus(p,C1)),-1)),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x),x)),And(FreeQ(List(a,b,c,d,e,g),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),GtQ(m,C1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,p),C2),C0),Or(LtQ(p,CN2),EqQ(m,C2)),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(4297,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(e),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,Times(C2,p))),-1)),x),Dist(Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Plus(m,Times(C2,p)),-1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,g,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),GtQ(m,C1),NeQ(Plus(m,Times(C2,p)),C0),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(4298,Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(e),Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,Times(C2,p))),-1)),x)),Dist(Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Plus(m,Times(C2,p)),-1)),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,g,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),GtQ(m,C1),NeQ(Plus(m,Times(C2,p)),C0),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(4299,Int(Times(Power(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),e_DEFAULT),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,p,C1)),-1)),x)),Dist(Times(Plus(m,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),-1)),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,g,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),LtQ(m,CN1),NeQ(Plus(m,Times(C2,p),C2),C0),NeQ(Plus(m,p,C1),C0),IntegersQ(Times(C2,m),Times(C2,p))))),
IIntegrate(4300,Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,p,C1)),-1)),x),Dist(Times(Plus(m,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),-1)),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,g,p),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Times(d,Power(b,-1)),C2),Not(IntegerQ(p)),LtQ(m,CN1),NeQ(Plus(m,Times(C2,p),C2),C0),NeQ(Plus(m,p,C1),C0),IntegersQ(Times(C2,m),Times(C2,p)))))
  );
}