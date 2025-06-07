package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class by3 extends gw3 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected j04 zzc = j04.c();

    protected static void B(Class cls, by3 by3Var) {
        by3Var.A();
        zzb.put(cls, by3Var);
    }

    private static by3 I(by3 by3Var) throws ny3 {
        if (by3Var == null || by3Var.D()) {
            return by3Var;
        }
        ny3 ny3VarA = new h04(by3Var).a();
        ny3VarA.h(by3Var);
        throw ny3VarA;
    }

    private static by3 J(by3 by3Var, byte[] bArr, int i10, int i11, qx3 qx3Var) throws ny3 {
        by3 by3VarK = by3Var.k();
        try {
            d04 d04VarB = rz3.a().b(by3VarK.getClass());
            d04VarB.i(by3VarK, bArr, 0, i11, new jw3(qx3Var));
            d04VarB.d(by3VarK);
            return by3VarK;
        } catch (h04 e5) {
            ny3 ny3VarA = e5.a();
            ny3VarA.h(by3VarK);
            throw ny3VarA;
        } catch (ny3 e10) {
            e = e10;
            if (e.m()) {
                e = new ny3(e);
            }
            e.h(by3VarK);
            throw e;
        } catch (IOException e11) {
            if (e11.getCause() instanceof ny3) {
                throw ((ny3) e11.getCause());
            }
            ny3 ny3Var = new ny3(e11);
            ny3Var.h(by3VarK);
            throw ny3Var;
        } catch (IndexOutOfBoundsException unused) {
            ny3 ny3VarK = ny3.k();
            ny3VarK.h(by3VarK);
            throw ny3VarK;
        }
    }

    private final int h(d04 d04Var) {
        if (d04Var != null) {
            return d04Var.a(this);
        }
        return rz3.a().b(getClass()).a(this);
    }

    static by3 j(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        by3 by3Var = (by3) map.get(cls);
        if (by3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                by3Var = (by3) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (by3Var == null) {
            by3Var = (by3) ((by3) t04.o(cls)).H(6, null, null);
            if (by3Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, by3Var);
        }
        return by3Var;
    }

    protected static by3 l(by3 by3Var, ww3 ww3Var) throws ny3 {
        qx3 qx3Var = qx3.f14532c;
        fx3 fx3VarV = ww3Var.v();
        by3 by3VarK = by3Var.k();
        try {
            d04 d04VarB = rz3.a().b(by3VarK.getClass());
            d04VarB.j(by3VarK, gx3.U(fx3VarV), qx3Var);
            d04VarB.d(by3VarK);
            try {
                fx3VarV.B(0);
                I(by3VarK);
                I(by3VarK);
                return by3VarK;
            } catch (ny3 e5) {
                e5.h(by3VarK);
                throw e5;
            }
        } catch (h04 e10) {
            ny3 ny3VarA = e10.a();
            ny3VarA.h(by3VarK);
            throw ny3VarA;
        } catch (ny3 e11) {
            e = e11;
            if (e.m()) {
                e = new ny3(e);
            }
            e.h(by3VarK);
            throw e;
        } catch (IOException e12) {
            if (e12.getCause() instanceof ny3) {
                throw ((ny3) e12.getCause());
            }
            ny3 ny3Var = new ny3(e12);
            ny3Var.h(by3VarK);
            throw ny3Var;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof ny3) {
                throw ((ny3) e13.getCause());
            }
            throw e13;
        }
    }

    protected static by3 m(by3 by3Var, byte[] bArr) throws ny3 {
        by3 by3VarJ = J(by3Var, bArr, 0, bArr.length, qx3.f14532c);
        I(by3VarJ);
        return by3VarJ;
    }

    protected static by3 o(by3 by3Var, ww3 ww3Var, qx3 qx3Var) throws ny3 {
        fx3 fx3VarV = ww3Var.v();
        by3 by3VarK = by3Var.k();
        try {
            d04 d04VarB = rz3.a().b(by3VarK.getClass());
            d04VarB.j(by3VarK, gx3.U(fx3VarV), qx3Var);
            d04VarB.d(by3VarK);
            try {
                fx3VarV.B(0);
                I(by3VarK);
                return by3VarK;
            } catch (ny3 e5) {
                e5.h(by3VarK);
                throw e5;
            }
        } catch (h04 e10) {
            ny3 ny3VarA = e10.a();
            ny3VarA.h(by3VarK);
            throw ny3VarA;
        } catch (ny3 e11) {
            e = e11;
            if (e.m()) {
                e = new ny3(e);
            }
            e.h(by3VarK);
            throw e;
        } catch (IOException e12) {
            if (e12.getCause() instanceof ny3) {
                throw ((ny3) e12.getCause());
            }
            ny3 ny3Var = new ny3(e12);
            ny3Var.h(by3VarK);
            throw ny3Var;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof ny3) {
                throw ((ny3) e13.getCause());
            }
            throw e13;
        }
    }

    protected static by3 p(by3 by3Var, InputStream inputStream, qx3 qx3Var) throws ny3 {
        fx3 fx3VarG = fx3.g(inputStream, 4096);
        by3 by3VarK = by3Var.k();
        try {
            d04 d04VarB = rz3.a().b(by3VarK.getClass());
            d04VarB.j(by3VarK, gx3.U(fx3VarG), qx3Var);
            d04VarB.d(by3VarK);
            I(by3VarK);
            return by3VarK;
        } catch (h04 e5) {
            ny3 ny3VarA = e5.a();
            ny3VarA.h(by3VarK);
            throw ny3VarA;
        } catch (ny3 e10) {
            e = e10;
            if (e.m()) {
                e = new ny3(e);
            }
            e.h(by3VarK);
            throw e;
        } catch (IOException e11) {
            if (e11.getCause() instanceof ny3) {
                throw ((ny3) e11.getCause());
            }
            ny3 ny3Var = new ny3(e11);
            ny3Var.h(by3VarK);
            throw ny3Var;
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof ny3) {
                throw ((ny3) e12.getCause());
            }
            throw e12;
        }
    }

    protected static by3 q(by3 by3Var, byte[] bArr, qx3 qx3Var) throws ny3 {
        by3 by3VarJ = J(by3Var, bArr, 0, bArr.length, qx3Var);
        I(by3VarJ);
        return by3VarJ;
    }

    protected static gy3 r() {
        return cy3.h();
    }

    protected static gy3 s(gy3 gy3Var) {
        int size = gy3Var.size();
        return gy3Var.j(size == 0 ? 10 : size + size);
    }

    protected static jy3 t() {
        return zy3.h();
    }

    protected static ky3 u() {
        return sz3.f();
    }

    protected static ky3 v(ky3 ky3Var) {
        int size = ky3Var.size();
        return ky3Var.j(size == 0 ? 10 : size + size);
    }

    static Object w(Method method, Object obj, Object... objArr) {
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

    protected static Object y(jz3 jz3Var, String str, Object[] objArr) {
        return new tz3(jz3Var, str, objArr);
    }

    final void A() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void C(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean D() {
        byte bByteValue = ((Byte) H(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = rz3.a().b(getClass()).g(this);
        H(2, true != zG ? null : this, null);
        return zG;
    }

    final boolean E() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    final int F() {
        return rz3.a().b(getClass()).b(this);
    }

    protected final yx3 G() {
        return (yx3) H(5, null, null);
    }

    protected abstract Object H(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.jz3
    public final int b() {
        int iH;
        if (E()) {
            iH = h(null);
            if (iH < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iH);
            }
        } else {
            iH = this.zzd & Integer.MAX_VALUE;
            if (iH == Integer.MAX_VALUE) {
                iH = h(null);
                if (iH < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iH);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iH;
            }
        }
        return iH;
    }

    @Override // com.google.android.gms.internal.ads.jz3
    public final void c(mx3 mx3Var) {
        rz3.a().b(getClass()).h(this, nx3.l(mx3Var));
    }

    @Override // com.google.android.gms.internal.ads.jz3
    public final /* synthetic */ iz3 d() {
        return (yx3) H(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.gw3
    final int e(d04 d04Var) {
        if (E()) {
            int iH = h(d04Var);
            if (iH >= 0) {
                return iH;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iH);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iH2 = h(d04Var);
        if (iH2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iH2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return rz3.a().b(getClass()).f(this, (by3) obj);
    }

    @Override // com.google.android.gms.internal.ads.kz3
    public final /* synthetic */ jz3 f() {
        return (by3) H(6, null, null);
    }

    public final int hashCode() {
        if (E()) {
            return F();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iF = F();
        this.zza = iF;
        return iF;
    }

    public final yx3 i() {
        yx3 yx3Var = (yx3) H(5, null, null);
        yx3Var.j(this);
        return yx3Var;
    }

    final by3 k() {
        return (by3) H(4, null, null);
    }

    public final String toString() {
        return lz3.a(this, super.toString());
    }

    protected final void z() {
        rz3.a().b(getClass()).d(this);
        A();
    }
}
