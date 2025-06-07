package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class dh {

    /* renamed from: r, reason: collision with root package name */
    private static final String f7296r = "dh";

    /* renamed from: a, reason: collision with root package name */
    protected final Context f7297a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f7298b;

    /* renamed from: c, reason: collision with root package name */
    private DexClassLoader f7299c;

    /* renamed from: d, reason: collision with root package name */
    private hg f7300d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f7301e;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7305i;

    /* renamed from: l, reason: collision with root package name */
    private wf f7308l;

    /* renamed from: o, reason: collision with root package name */
    private final Map f7311o;

    /* renamed from: q, reason: collision with root package name */
    private wg f7313q;

    /* renamed from: f, reason: collision with root package name */
    private volatile h3.a f7302f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f7303g = false;

    /* renamed from: h, reason: collision with root package name */
    private Future f7304h = null;

    /* renamed from: j, reason: collision with root package name */
    private volatile vd f7306j = null;

    /* renamed from: k, reason: collision with root package name */
    private Future f7307k = null;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f7309m = false;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f7310n = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7312p = false;

    private dh(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7305i = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.f7297a = context;
        this.f7311o = new HashMap();
        if (this.f7313q != null) {
            return;
        }
        this.f7313q = new wg(context);
    }

    public static dh g(Context context, String str, String str2, boolean z10) throws Throwable {
        hg hgVar;
        dh dhVar = new dh(context);
        try {
            dhVar.f7298b = Executors.newCachedThreadPool(new zg());
            dhVar.f7303g = z10;
            if (z10) {
                dhVar.f7304h = dhVar.f7298b.submit(new ah(dhVar));
            }
            dhVar.f7298b.execute(new ch(dhVar));
            try {
                b4.f fVarH = b4.f.h();
                dhVar.f7309m = fVarH.b(dhVar.f7297a) > 0;
                dhVar.f7310n = fVarH.i(dhVar.f7297a) == 0;
            } catch (Throwable unused) {
            }
            dhVar.o(0, true);
            if (hh.c() && ((Boolean) k3.w.c().b(ir.S2)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            hgVar = new hg(null);
            dhVar.f7300d = hgVar;
            try {
            } catch (gg e5) {
                throw new tg(e5);
            }
        } catch (tg unused2) {
        }
        try {
            byte[] bArrB = ke.b("kSZGl2wIzAC9o1umQ7rlAOj3/PdgBP/Y/cWyDef6yws=", false);
            if (bArrB.length != 32) {
                throw new gg(hgVar);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(bArrB, 4, 16).get(bArr);
            for (int i10 = 0; i10 < 16; i10++) {
                bArr[i10] = (byte) (bArr[i10] ^ 68);
            }
            dhVar.f7301e = bArr;
            try {
                try {
                    File cacheDir = dhVar.f7297a.getCacheDir();
                    if (cacheDir == null && (cacheDir = dhVar.f7297a.getDir("dex", 0)) == null) {
                        throw new tg();
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1675452915457"));
                    if (!file.exists()) {
                        byte[] bArrB2 = dhVar.f7300d.b(dhVar.f7301e, "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");
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        if (Build.VERSION.SDK_INT >= 33) {
                            file.setReadOnly();
                        }
                        fileOutputStream.write(bArrB2, 0, bArrB2.length);
                        fileOutputStream.close();
                    }
                    dhVar.x(cacheDir, "1675452915457");
                    try {
                        dhVar.f7299c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, dhVar.f7297a.getClassLoader());
                        y(file);
                        dhVar.w(cacheDir, "1675452915457");
                        z(String.format("%s/%s.dex", cacheDir, "1675452915457"));
                        dhVar.f7308l = new wf(dhVar);
                        dhVar.f7312p = true;
                        return dhVar;
                    } catch (Throwable th) {
                        y(file);
                        dhVar.w(cacheDir, "1675452915457");
                        z(String.format("%s/%s.dex", cacheDir, "1675452915457"));
                        throw th;
                    }
                } catch (gg e10) {
                    throw new tg(e10);
                } catch (IOException e11) {
                    throw new tg(e11);
                }
            } catch (FileNotFoundException e12) {
                throw new tg(e12);
            } catch (NullPointerException e13) {
                throw new tg(e13);
            }
        } catch (IllegalArgumentException e14) {
            throw new gg(hgVar, e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        try {
            if (this.f7302f == null && this.f7305i) {
                h3.a aVar = new h3.a(this.f7297a);
                aVar.e();
                this.f7302f = aVar;
            }
        } catch (b4.g | IOException unused) {
            this.f7302f = null;
        }
    }

    private final void w(File file, String str) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1675452915457"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1675452915457"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        y(file3);
                        return;
                    }
                    System.out.print("test");
                    System.out.print("test");
                    System.out.print("test");
                    yd ydVarK = zd.K();
                    byte[] bytes = Build.VERSION.SDK.getBytes();
                    ww3 ww3Var = ww3.f17284n;
                    ydVarK.w(ww3.I(bytes, 0, bytes.length));
                    byte[] bytes2 = "1675452915457".getBytes();
                    ydVarK.y(ww3.I(bytes2, 0, bytes2.length));
                    byte[] bytes3 = this.f7300d.a(this.f7301e, bArr).getBytes();
                    ydVarK.u(ww3.I(bytes3, 0, bytes3.length));
                    byte[] bArrE = oe.e(bytes3);
                    ydVarK.v(ww3.I(bArrE, 0, bArrE.length));
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArrX = ((zd) ydVarK.m()).x();
                        fileOutputStream.write(bArrX, 0, bArrX.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        y(file3);
                    } catch (gg | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        y(file3);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        y(file3);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (gg | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            }
        } catch (gg | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private final boolean x(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1675452915457"));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1675452915457"));
        if (!file3.exists()) {
            FileInputStream fileInputStream = null;
            try {
                long length = file2.length();
                if (length <= 0) {
                    y(file2);
                    return false;
                }
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            Log.d(f7296r, "Cannot read the cache data.");
                            y(file2);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                            return false;
                        }
                        try {
                            try {
                                zd zdVarM = zd.M(bArr, qx3.a());
                                if ("1675452915457".equals(new String(zdVarM.Q().f())) && Arrays.equals(zdVarM.O().f(), oe.e(zdVarM.N().f())) && Arrays.equals(zdVarM.P().f(), Build.VERSION.SDK.getBytes())) {
                                    byte[] bArrB = this.f7300d.b(this.f7301e, new String(zdVarM.N().f()));
                                    file3.createNewFile();
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(bArrB, 0, bArrB.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                        return true;
                                    } catch (gg | IOException | NoSuchAlgorithmException unused4) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused6) {
                                            }
                                        }
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused7) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (IOException unused8) {
                                            throw th;
                                        }
                                    }
                                }
                                y(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused9) {
                                }
                                return false;
                            } catch (IOException unused10) {
                                return false;
                            }
                        } catch (NullPointerException unused11) {
                            fileInputStream2.close();
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (gg | IOException | NoSuchAlgorithmException unused12) {
                    fileOutputStream = null;
                }
            } catch (gg | IOException | NoSuchAlgorithmException unused13) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        }
        return false;
    }

    private static final void y(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(f7296r, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private static final void z(String str) {
        y(new File(str));
    }

    public final int a() {
        if (this.f7308l != null) {
            return wf.d();
        }
        return Integer.MIN_VALUE;
    }

    public final Context b() {
        return this.f7297a;
    }

    public final vd c() {
        return this.f7306j;
    }

    public final wf d() {
        return this.f7308l;
    }

    public final hg e() {
        return this.f7300d;
    }

    final wg f() {
        return this.f7313q;
    }

    public final h3.a h() throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f7303g) {
            return null;
        }
        if (this.f7302f != null) {
            return this.f7302f;
        }
        Future future = this.f7304h;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.f7304h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f7304h.cancel(true);
            }
        }
        return this.f7302f;
    }

    public final DexClassLoader i() {
        return this.f7299c;
    }

    public final Method j(String str, String str2) {
        si siVar = (si) this.f7311o.get(new Pair(str, str2));
        if (siVar == null) {
            return null;
        }
        return siVar.a();
    }

    public final ExecutorService k() {
        return this.f7298b;
    }

    public final Future l() {
        return this.f7307k;
    }

    final void o(int i10, boolean z10) {
        if (this.f7310n) {
            Future<?> futureSubmit = this.f7298b.submit(new bh(this, i10, true));
            if (i10 == 0) {
                this.f7307k = futureSubmit;
            }
        }
    }

    public final boolean p() {
        return this.f7310n;
    }

    public final boolean q() {
        return this.f7309m;
    }

    public final boolean r() {
        return this.f7312p;
    }

    public final boolean s() {
        return this.f7313q.a();
    }

    public final boolean t(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (this.f7311o.containsKey(pair)) {
            return false;
        }
        this.f7311o.put(pair, new si(this, str, str2, clsArr));
        return true;
    }

    public final byte[] u() {
        return this.f7301e;
    }
}
