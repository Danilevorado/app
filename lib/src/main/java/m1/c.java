package m1;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    private static c f25173g;

    /* renamed from: a, reason: collision with root package name */
    private final b f25174a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f25175b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25176c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25177d;

    /* renamed from: e, reason: collision with root package name */
    private final d f25178e;

    /* renamed from: f, reason: collision with root package name */
    private final a f25179f;

    private c(Context context) {
        b bVar = new b(context);
        this.f25174a = bVar;
        this.f25178e = new d(bVar);
        this.f25179f = new a();
    }

    public static c b() {
        return f25173g;
    }

    public static void c(Context context) {
        if (f25173g == null) {
            f25173g = new c(context);
        }
    }

    public void a() {
        Camera camera = this.f25175b;
        if (camera != null) {
            camera.release();
            this.f25176c = false;
            this.f25177d = false;
            this.f25175b = null;
        }
    }

    public void d(SurfaceHolder surfaceHolder) throws IOException, NumberFormatException {
        if (this.f25175b == null) {
            Camera cameraOpen = Camera.open();
            this.f25175b = cameraOpen;
            if (cameraOpen == null) {
                throw new IOException();
            }
            cameraOpen.setPreviewDisplay(surfaceHolder);
            if (!this.f25176c) {
                this.f25176c = true;
                this.f25174a.d(this.f25175b);
            }
            this.f25174a.e(this.f25175b);
        }
    }

    public void e(Handler handler, int i10) {
        if (this.f25175b == null || !this.f25177d) {
            return;
        }
        this.f25179f.a(handler, i10);
        this.f25175b.autoFocus(this.f25179f);
    }

    public void f(Handler handler, int i10) {
        if (this.f25175b == null || !this.f25177d) {
            return;
        }
        this.f25178e.a(handler, i10);
        this.f25175b.setOneShotPreviewCallback(this.f25178e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r2.contains("off") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(boolean r6) {
        /*
            r5 = this;
            android.hardware.Camera r0 = r5.f25175b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.util.List r2 = r0.getSupportedFlashModes()
            if (r2 == 0) goto L4a
            int r3 = r2.size()
            if (r3 != 0) goto L1a
            goto L4a
        L1a:
            java.lang.String r3 = r0.getFlashMode()
            r4 = 1
            if (r6 == 0) goto L3a
            java.lang.String r6 = "torch"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L2a
            return r4
        L2a:
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L39
        L30:
            r0.setFlashMode(r6)
            android.hardware.Camera r6 = r5.f25175b
            r6.setParameters(r0)
            return r4
        L39:
            return r1
        L3a:
            java.lang.String r6 = "off"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L43
            return r4
        L43:
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L4a
            goto L30
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.g(boolean):boolean");
    }

    public void h() {
        Camera camera = this.f25175b;
        if (camera == null || this.f25177d) {
            return;
        }
        camera.startPreview();
        this.f25177d = true;
    }

    public void i() {
        Camera camera = this.f25175b;
        if (camera == null || !this.f25177d) {
            return;
        }
        camera.stopPreview();
        this.f25178e.a(null, 0);
        this.f25179f.a(null, 0);
        this.f25177d = false;
    }
}
