package n1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public class e {

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f25470m;

        b(d dVar) {
            this.f25470m = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            d dVar = this.f25470m;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    public interface d {
        void a();
    }

    public void a(Context context) {
        new AlertDialog.Builder(context).setTitle(l1.g.f25044h).setMessage(l1.g.f25042f).setPositiveButton(l1.g.f25037a, new c()).show();
    }

    public void b(Context context, d dVar) {
        new AlertDialog.Builder(context).setTitle(l1.g.f25044h).setMessage(l1.g.f25043g).setPositiveButton(l1.g.f25037a, new b(dVar)).show();
    }

    public void c(Context context) {
        new AlertDialog.Builder(context).setTitle(l1.g.f25044h).setMessage(l1.g.f25040d).setPositiveButton(l1.g.f25047k, new a()).show();
    }

    public void d(Activity activity, String str, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(activity).setTitle(l1.g.f25044h).setMessage(str).setPositiveButton(l1.g.f25046j, onClickListener).show();
    }
}
