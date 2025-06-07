package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bg1 {

    /* renamed from: a, reason: collision with root package name */
    private final m3.q0 f6465a;

    /* renamed from: b, reason: collision with root package name */
    private final i4.e f6466b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6467c;

    public bg1(m3.q0 q0Var, i4.e eVar, Executor executor) {
        this.f6465a = q0Var;
        this.f6466b = eVar;
        this.f6467c = executor;
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long jB = this.f6466b.b();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jB2 = this.f6466b.b();
        if (bitmapDecodeByteArray != null) {
            long j10 = jB2 - jB;
            m3.n1.k("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j10 + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ Bitmap a(double d10, boolean z10, ja jaVar) {
        byte[] bArr = jaVar.f10397b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) k3.w.c().b(ir.N5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) k3.w.c().b(ir.O5)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final ab3 b(String str, final double d10, final boolean z10) {
        return qa3.l(this.f6465a.a(str), new w23() { // from class: com.google.android.gms.internal.ads.ag1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return this.f6077a.a(d10, z10, (ja) obj);
            }
        }, this.f6467c);
    }
}
