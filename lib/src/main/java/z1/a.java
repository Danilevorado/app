package z1;

import a2.l;
import a2.m;
import a2.r;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import r1.g;
import r1.h;
import r1.i;

/* loaded from: classes.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final r f28752a = r.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f28753b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28754c;

    /* renamed from: d, reason: collision with root package name */
    private final r1.b f28755d;

    /* renamed from: e, reason: collision with root package name */
    private final l f28756e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f28757f;

    /* renamed from: g, reason: collision with root package name */
    private final i f28758g;

    /* renamed from: z1.a$a, reason: collision with other inner class name */
    class C0219a implements ImageDecoder.OnPartialImageListener {
        C0219a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i10, int i11, h hVar) {
        this.f28753b = i10;
        this.f28754c = i11;
        this.f28755d = (r1.b) hVar.c(m.f44f);
        this.f28756e = (l) hVar.c(l.f39h);
        g gVar = m.f48j;
        this.f28757f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f28758g = (i) hVar.c(m.f45g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z10 = false;
        if (this.f28752a.e(this.f28753b, this.f28754c, this.f28757f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f28755d == r1.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0219a());
        Size size = imageInfo.getSize();
        int width = this.f28753b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f28754c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f28756e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f28758g;
        if (iVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                if (iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                if (z10) {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            }
            if (i10 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
