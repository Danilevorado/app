package l3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import m3.b2;

/* loaded from: classes.dex */
final class q extends m3.b0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f25081c;

    /* synthetic */ q(r rVar, p pVar) {
        this.f25081c = rVar;
    }

    @Override // m3.b0
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        Bitmap bitmapA = j3.t.w().a(Integer.valueOf(this.f25081c.f25083n.A.f24482r));
        if (bitmapA != null) {
            j3.t.r();
            r rVar = this.f25081c;
            Activity activity = rVar.f25082m;
            j3.j jVar = rVar.f25083n.A;
            boolean z10 = jVar.f24480p;
            float f5 = jVar.f24481q;
            if (!z10 || f5 <= 0.0f || f5 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapA);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, bitmapA.getWidth(), bitmapA.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f5);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapA);
                }
            }
            b2.f25197i.post(new Runnable() { // from class: l3.o
                @Override // java.lang.Runnable
                public final void run() {
                    q qVar = this.f25079m;
                    qVar.f25081c.f25082m.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
