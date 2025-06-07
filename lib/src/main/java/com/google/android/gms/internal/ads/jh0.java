package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public final class jh0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, hh0 {
    private static final float[] N = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private SurfaceTexture A;
    private int B;
    private int C;
    private int D;
    private final FloatBuffer E;
    private final CountDownLatch F;
    private final Object G;
    private EGL10 H;
    private EGLDisplay I;
    private EGLContext J;
    private EGLSurface K;
    private volatile boolean L;
    private volatile boolean M;

    /* renamed from: m, reason: collision with root package name */
    private final ih0 f10481m;

    /* renamed from: n, reason: collision with root package name */
    private final float[] f10482n;

    /* renamed from: o, reason: collision with root package name */
    private final float[] f10483o;

    /* renamed from: p, reason: collision with root package name */
    private final float[] f10484p;

    /* renamed from: q, reason: collision with root package name */
    private final float[] f10485q;

    /* renamed from: r, reason: collision with root package name */
    private final float[] f10486r;

    /* renamed from: s, reason: collision with root package name */
    private final float[] f10487s;

    /* renamed from: t, reason: collision with root package name */
    private final float[] f10488t;

    /* renamed from: u, reason: collision with root package name */
    private float f10489u;

    /* renamed from: v, reason: collision with root package name */
    private float f10490v;

    /* renamed from: w, reason: collision with root package name */
    private float f10491w;

    /* renamed from: x, reason: collision with root package name */
    private int f10492x;

    /* renamed from: y, reason: collision with root package name */
    private int f10493y;

    /* renamed from: z, reason: collision with root package name */
    private SurfaceTexture f10494z;

    public jh0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = N;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.E = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f10482n = new float[9];
        this.f10483o = new float[9];
        this.f10484p = new float[9];
        this.f10485q = new float[9];
        this.f10486r = new float[9];
        this.f10487s = new float[9];
        this.f10488t = new float[9];
        this.f10489u = Float.NaN;
        ih0 ih0Var = new ih0(context);
        this.f10481m = ih0Var;
        ih0Var.a(this);
        this.F = new CountDownLatch(1);
        this.G = new Object();
    }

    private static final void h(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    private static final void i(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static final void j(float[] fArr, float f5) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f5;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    private static final void k(float[] fArr, float f5) {
        double d10 = f5;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int l(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        h("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            h("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            h("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            h("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i10 + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                h("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    @Override // com.google.android.gms.internal.ads.hh0
    public final void a() {
        synchronized (this.G) {
            this.G.notifyAll();
        }
    }

    public final SurfaceTexture b() throws InterruptedException {
        if (this.A == null) {
            return null;
        }
        try {
            this.F.await();
        } catch (InterruptedException unused) {
        }
        return this.f10494z;
    }

    public final void c(int i10, int i11) {
        synchronized (this.G) {
            this.f10493y = i10;
            this.f10492x = i11;
            this.L = true;
            this.G.notifyAll();
        }
    }

    public final void d(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f10493y = i10;
        this.f10492x = i11;
        this.A = surfaceTexture;
    }

    public final void e() {
        synchronized (this.G) {
            this.M = true;
            this.A = null;
            this.G.notifyAll();
        }
    }

    public final void f(float f5, float f10) {
        int i10 = this.f10493y;
        int i11 = this.f10492x;
        float f11 = f5 * 1.7453293f;
        float f12 = f10 * 1.7453293f;
        float f13 = i10 > i11 ? i10 : i11;
        this.f10490v -= f11 / f13;
        float f14 = this.f10491w - (f12 / f13);
        this.f10491w = f14;
        if (f14 < -1.5707964f) {
            this.f10491w = -1.5707964f;
            f14 = -1.5707964f;
        }
        if (f14 > 1.5707964f) {
            this.f10491w = 1.5707964f;
        }
    }

    final boolean g() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.K;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.H.eglDestroySurface(this.I, this.K) | this.H.eglMakeCurrent(this.I, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.K = null;
        }
        EGLContext eGLContext = this.J;
        if (eGLContext != null) {
            zEglDestroyContext |= this.H.eglDestroyContext(this.I, eGLContext);
            this.J = null;
        }
        EGLDisplay eGLDisplay = this.I;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.H.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.I = null;
        return zEglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.D++;
        synchronized (this.G) {
            this.G.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jh0.run():void");
    }
}
