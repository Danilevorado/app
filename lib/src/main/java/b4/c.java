package b4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: m, reason: collision with root package name */
    private Dialog f4404m;

    /* renamed from: n, reason: collision with root package name */
    private DialogInterface.OnCancelListener f4405n;

    /* renamed from: o, reason: collision with root package name */
    private Dialog f4406o;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) e4.p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f4404m = dialog2;
        if (onCancelListener != null) {
            cVar.f4405n = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4405n;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4404m;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f4406o == null) {
            this.f4406o = new AlertDialog.Builder((Context) e4.p.l(getActivity())).create();
        }
        return this.f4406o;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
