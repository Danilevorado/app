package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class bz2 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f6723f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f6724a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6725b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6726c;

    /* renamed from: d, reason: collision with root package name */
    private final hy2 f6727d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6728e;

    public bz2(Context context, int i10, hy2 hy2Var, boolean z10) {
        this.f6728e = false;
        this.f6724a = context;
        this.f6726c = Integer.toString(i10 - 1);
        this.f6725b = context.getSharedPreferences("pcvmspf", 0);
        this.f6727d = hy2Var;
        this.f6728e = z10;
    }

    private final File e(String str) {
        return new File(new File(this.f6724a.getDir("pccache", 0), this.f6726c), str);
    }

    private static String f(zi ziVar) {
        bj bjVarN = cj.N();
        bjVarN.z(ziVar.M().T());
        bjVarN.u(ziVar.M().S());
        bjVarN.v(ziVar.M().K());
        bjVarN.y(ziVar.M().M());
        bjVarN.w(ziVar.M().L());
        return i4.j.a(((cj) bjVarN.m()).x());
    }

    private final String g() {
        return "FBAMTD".concat(String.valueOf(this.f6726c));
    }

    private final String h() {
        return "LATMTD".concat(String.valueOf(this.f6726c));
    }

    private final void i(int i10, long j10) {
        hy2 hy2Var = this.f6727d;
        if (hy2Var != null) {
            hy2Var.b(i10, j10);
        }
    }

    private final void j(int i10, long j10, String str) {
        hy2 hy2Var = this.f6727d;
        if (hy2Var != null) {
            hy2Var.a(i10, j10, str);
        }
    }

    private final cj k(int i10) {
        SharedPreferences sharedPreferences;
        String strG;
        int i11;
        if (i10 == 1) {
            sharedPreferences = this.f6725b;
            strG = h();
        } else {
            sharedPreferences = this.f6725b;
            strG = g();
        }
        String string = sharedPreferences.getString(strG, null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrC = i4.j.c(string);
            ww3 ww3Var = ww3.f17284n;
            return cj.R(ww3.I(bArrC, 0, bArrC.length), this.f6728e ? qx3.a() : qx3.b());
        } catch (ny3 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i11 = 2029;
            i(i11, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i11 = 2032;
            i(i11, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean a(zi ziVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f6723f) {
            if (!vy2.e(new File(e(ziVar.M().T()), "pcbc"), ziVar.N().f())) {
                i(4020, jCurrentTimeMillis);
                return false;
            }
            String strF = f(ziVar);
            SharedPreferences.Editor editorEdit = this.f6725b.edit();
            editorEdit.putString(h(), strF);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                i(5015, jCurrentTimeMillis);
            } else {
                i(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final boolean b(zi ziVar, az2 az2Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f6723f) {
            cj cjVarK = k(1);
            String strT = ziVar.M().T();
            if (cjVarK != null && cjVarK.T().equals(strT)) {
                i(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileE = e(strT);
            if (fileE.exists()) {
                j(4023, jCurrentTimeMillis2, "d:" + (true != fileE.isDirectory() ? "0" : "1") + ",f:" + (true != fileE.isFile() ? "0" : "1"));
                i(4015, jCurrentTimeMillis2);
            } else if (!fileE.mkdirs()) {
                j(4024, jCurrentTimeMillis2, "cw:".concat(true != fileE.canWrite() ? "0" : "1"));
                i(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileE2 = e(strT);
            File file = new File(fileE2, "pcam.jar");
            File file2 = new File(fileE2, "pcbc");
            if (!vy2.e(file, ziVar.O().f())) {
                i(4016, jCurrentTimeMillis);
                return false;
            }
            if (!vy2.e(file2, ziVar.N().f())) {
                i(4017, jCurrentTimeMillis);
                return false;
            }
            if (az2Var != null && !az2Var.a(file)) {
                i(4018, jCurrentTimeMillis);
                vy2.d(fileE2);
                return false;
            }
            String strF = f(ziVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.f6725b.getString(h(), null);
            SharedPreferences.Editor editorEdit = this.f6725b.edit();
            editorEdit.putString(h(), strF);
            if (string != null) {
                editorEdit.putString(g(), string);
            }
            if (!editorEdit.commit()) {
                i(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            cj cjVarK2 = k(1);
            if (cjVarK2 != null) {
                hashSet.add(cjVarK2.T());
            }
            cj cjVarK3 = k(2);
            if (cjVarK3 != null) {
                hashSet.add(cjVarK3.T());
            }
            for (File file3 : new File(this.f6724a.getDir("pccache", 0), this.f6726c).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    vy2.d(file3);
                }
            }
            i(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final sy2 c(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f6723f) {
            cj cjVarK = k(1);
            if (cjVarK == null) {
                i(4022, jCurrentTimeMillis);
                return null;
            }
            File fileE = e(cjVarK.T());
            File file = new File(fileE, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileE, "pcam");
            }
            File file2 = new File(fileE, "pcbc");
            File file3 = new File(fileE, "pcopt");
            i(5016, jCurrentTimeMillis);
            return new sy2(cjVarK, file, file2, file3);
        }
    }

    public final boolean d(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f6723f) {
            cj cjVarK = k(1);
            if (cjVarK == null) {
                i(4025, jCurrentTimeMillis);
                return false;
            }
            File fileE = e(cjVarK.T());
            if (!new File(fileE, "pcam.jar").exists()) {
                i(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileE, "pcbc").exists()) {
                i(5019, jCurrentTimeMillis);
                return true;
            }
            i(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
