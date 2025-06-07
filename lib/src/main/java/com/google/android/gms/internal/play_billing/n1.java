package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class n1 extends z {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected w3 zzc = w3.c();

    private static n1 A(n1 n1Var, byte[] bArr, int i10, int i11, c1 c1Var) throws x1 {
        if (i11 == 0) {
            return n1Var;
        }
        n1 n1VarL = n1Var.l();
        try {
            f3 f3VarB = c3.a().b(n1VarL.getClass());
            f3VarB.i(n1VarL, bArr, 0, i11, new d0(c1Var));
            f3VarB.d(n1VarL);
            return n1VarL;
        } catch (u3 e5) {
            x1 x1VarA = e5.a();
            x1VarA.f(n1VarL);
            throw x1VarA;
        } catch (x1 e10) {
            e10.f(n1VarL);
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof x1) {
                throw ((x1) e11.getCause());
            }
            x1 x1Var = new x1(e11);
            x1Var.f(n1VarL);
            throw x1Var;
        } catch (IndexOutOfBoundsException unused) {
            x1 x1VarG = x1.g();
            x1VarG.f(n1VarL);
            throw x1VarG;
        }
    }

    static n1 j(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        n1 n1Var = (n1) map.get(cls);
        if (n1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n1Var = (n1) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (n1Var == null) {
            n1Var = (n1) ((n1) f4.j(cls)).x(6, null, null);
            if (n1Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, n1Var);
        }
        return n1Var;
    }

    protected static n1 m(n1 n1Var, byte[] bArr, c1 c1Var) throws x1 {
        n1 n1VarA = A(n1Var, bArr, 0, bArr.length, c1Var);
        if (n1VarA == null || n1VarA.k()) {
            return n1VarA;
        }
        x1 x1VarA = new u3(n1VarA).a();
        x1VarA.f(n1VarA);
        throw x1VarA;
    }

    protected static s1 n() {
        return o1.h();
    }

    protected static u1 o() {
        return d3.f();
    }

    static Object p(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object q(u2 u2Var, String str, Object[] objArr) {
        return new e3(u2Var, str, objArr);
    }

    protected static void t(Class cls, n1 n1Var) {
        n1Var.s();
        zzb.put(cls, n1Var);
    }

    protected static final boolean v(n1 n1Var, boolean z10) {
        byte bByteValue = ((Byte) n1Var.x(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = c3.a().b(n1Var.getClass()).g(n1Var);
        if (z10) {
            n1Var.x(2, true != zG ? null : n1Var, null);
        }
        return zG;
    }

    private final int y(f3 f3Var) {
        return c3.a().b(getClass()).a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final /* synthetic */ t2 E() {
        return (l1) x(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final void a(y0 y0Var) {
        c3.a().b(getClass()).h(this, z0.J(y0Var));
    }

    @Override // com.google.android.gms.internal.play_billing.z
    final int b(f3 f3Var) {
        if (w()) {
            int iA = f3Var.a(this);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iA2 = f3Var.a(this);
        if (iA2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iA2);
    }

    final int d() {
        return c3.a().b(getClass()).b(this);
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final int e() {
        int iY;
        if (w()) {
            iY = y(null);
            if (iY < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iY);
            }
        } else {
            iY = this.zzd & Integer.MAX_VALUE;
            if (iY == Integer.MAX_VALUE) {
                iY = y(null);
                if (iY < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iY);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iY;
            }
        }
        return iY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return c3.a().b(getClass()).f(this, (n1) obj);
    }

    protected final l1 f() {
        return (l1) x(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.v2
    public final /* synthetic */ u2 g() {
        return (n1) x(6, null, null);
    }

    public final int hashCode() {
        if (w()) {
            return d();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iD = d();
        this.zza = iD;
        return iD;
    }

    public final l1 i() {
        l1 l1Var = (l1) x(5, null, null);
        l1Var.c(this);
        return l1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.v2
    public final boolean k() {
        return v(this, true);
    }

    final n1 l() {
        return (n1) x(4, null, null);
    }

    protected final void r() {
        c3.a().b(getClass()).d(this);
        s();
    }

    final void s() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return w2.a(this, super.toString());
    }

    final void u(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean w() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object x(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.u2
    public final /* synthetic */ t2 z() {
        l1 l1Var = (l1) x(5, null, null);
        l1Var.c(this);
        return l1Var;
    }
}
