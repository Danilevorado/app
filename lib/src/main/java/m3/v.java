package m3;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
final class v implements DialogInterface.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ w f25328m;

    v(w wVar) {
        this.f25328m = wVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        j3.t.r();
        b2.p(this.f25328m.f25331m, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
