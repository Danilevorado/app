package n1;

import android.app.Activity;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class g implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final Activity f25476m;

    public g(Activity activity) {
        this.f25476m = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25476m.finish();
    }
}
