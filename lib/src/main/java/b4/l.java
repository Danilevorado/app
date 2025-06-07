package b4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class l extends androidx.fragment.app.d {
    private Dialog D0;
    private DialogInterface.OnCancelListener E0;
    private Dialog F0;

    public static l b2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) e4.p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.D0 = dialog2;
        if (onCancelListener != null) {
            lVar.E0 = onCancelListener;
        }
        return lVar;
    }

    @Override // androidx.fragment.app.d
    public Dialog T1(Bundle bundle) {
        Dialog dialog = this.D0;
        if (dialog != null) {
            return dialog;
        }
        Y1(false);
        if (this.F0 == null) {
            this.F0 = new AlertDialog.Builder((Context) e4.p.l(v())).create();
        }
        return this.F0;
    }

    @Override // androidx.fragment.app.d
    public void a2(androidx.fragment.app.m mVar, String str) {
        super.a2(mVar, str);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.E0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
