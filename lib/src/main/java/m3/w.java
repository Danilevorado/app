package m3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Context f25331m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f25332n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f25333o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f25334p;

    w(x xVar, Context context, String str, boolean z10, boolean z11) {
        this.f25331m = context;
        this.f25332n = str;
        this.f25333o = z10;
        this.f25334p = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j3.t.r();
        AlertDialog.Builder builderF = b2.f(this.f25331m);
        builderF.setMessage(this.f25332n);
        builderF.setTitle(this.f25333o ? "Error" : "Info");
        if (this.f25334p) {
            builderF.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderF.setPositiveButton("Learn More", new v(this));
            builderF.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderF.create().show();
    }
}
