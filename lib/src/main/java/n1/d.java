package n1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import r6.k;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private byte[] f25464m;

    /* renamed from: n, reason: collision with root package name */
    private int f25465n;

    /* renamed from: o, reason: collision with root package name */
    private int f25466o;

    /* renamed from: p, reason: collision with root package name */
    private String f25467p;

    /* renamed from: q, reason: collision with root package name */
    private c f25468q;

    public d(String str, c cVar) {
        this.f25467p = str;
        this.f25468q = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        int i11;
        if (this.f25464m == null && !TextUtils.isEmpty(this.f25467p)) {
            Bitmap bitmapC = o1.a.c(this.f25467p, 256, 256);
            this.f25464m = o1.a.e(bitmapC.getWidth(), bitmapC.getHeight(), bitmapC);
            this.f25465n = bitmapC.getWidth();
            this.f25466o = bitmapC.getHeight();
        }
        byte[] bArr = this.f25464m;
        if (bArr == null || bArr.length == 0 || (i10 = this.f25465n) == 0 || (i11 = this.f25466o) == 0) {
            c cVar = this.f25468q;
            if (cVar != null) {
                cVar.b(0, "No image data");
                return;
            }
            return;
        }
        k kVarB = o1.a.b(bArr, i10, i11);
        c cVar2 = this.f25468q;
        if (cVar2 != null) {
            if (kVarB != null) {
                cVar2.a(kVarB);
            } else {
                cVar2.b(0, "Decode image failed.");
            }
        }
    }
}
