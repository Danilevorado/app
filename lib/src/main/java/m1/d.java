package m1;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

/* loaded from: classes.dex */
final class d implements Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    private static final String f25180d = d.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private final b f25181a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f25182b;

    /* renamed from: c, reason: collision with root package name */
    private int f25183c;

    d(b bVar) {
        this.f25181a = bVar;
    }

    void a(Handler handler, int i10) {
        this.f25182b = handler;
        this.f25183c = i10;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size sizeC = this.f25181a.c();
        Handler handler = this.f25182b;
        if (handler == null) {
            Log.v(f25180d, "no handler callback.");
        } else {
            handler.obtainMessage(this.f25183c, sizeC.width, sizeC.height, bArr).sendToTarget();
            this.f25182b = null;
        }
    }
}
