package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nz1 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f12916s = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: m, reason: collision with root package name */
    private final Handler f12917m;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f12918n = new int[1];

    /* renamed from: o, reason: collision with root package name */
    private EGLDisplay f12919o;

    /* renamed from: p, reason: collision with root package name */
    private EGLContext f12920p;

    /* renamed from: q, reason: collision with root package name */
    private EGLSurface f12921q;

    /* renamed from: r, reason: collision with root package name */
    private SurfaceTexture f12922r;

    public nz1(Handler handler, my1 my1Var) {
        this.f12917m = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f12922r;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    public final void b(int i10) throws o02 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        p12.a(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        p12.a(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f12919o = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f12916s, 0, eGLConfigArr, 0, 1, iArr2, 0);
        p12.a(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f12919o, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        p12.a(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.f12920p = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f12919o;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            p12.a(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        p12.a(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.f12921q = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f12918n, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z10 = true;
        }
        if (z10) {
            throw new o02(sb2.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12918n[0]);
        this.f12922r = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.f12917m.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f12922r;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f12918n, 0);
            }
            EGLDisplay eGLDisplay = this.f12919o;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f12919o;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f12921q;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f12919o, this.f12921q);
            }
            EGLContext eGLContext = this.f12920p;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f12919o, eGLContext);
            }
            int i10 = sv2.f15560a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f12919o;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f12919o);
            }
            this.f12919o = null;
            this.f12920p = null;
            this.f12921q = null;
            this.f12922r = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f12919o;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f12919o;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f12921q;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f12919o, this.f12921q);
            }
            EGLContext eGLContext2 = this.f12920p;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f12919o, eGLContext2);
            }
            int i11 = sv2.f15560a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f12919o;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f12919o);
            }
            this.f12919o = null;
            this.f12920p = null;
            this.f12921q = null;
            this.f12922r = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f12917m.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f12922r;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
