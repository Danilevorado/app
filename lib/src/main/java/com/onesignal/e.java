package com.onesignal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f21866a = new e();

    public interface a {
        void a();

        void b();
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, DialogInterface dialogInterface, int i10) {
        rb.h.e(aVar, "$callback");
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a aVar, DialogInterface dialogInterface, int i10) {
        rb.h.e(aVar, "$callback");
        aVar.b();
    }

    public final void c(Activity activity, String str, String str2, final a aVar) {
        rb.h.e(activity, "activity");
        rb.h.e(str, "titlePrefix");
        rb.h.e(str2, "previouslyDeniedPostfix");
        rb.h.e(aVar, "callback");
        String string = activity.getString(c4.f21799i);
        rb.h.d(string, "activity.getString(R.str…sion_not_available_title)");
        String str3 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        rb.h.d(str3, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(c4.f21797g);
        rb.h.d(string2, "activity.getString(R.str…on_not_available_message)");
        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        rb.h.d(str4, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(str3).setMessage(str4).setPositiveButton(c4.f21798h, new DialogInterface.OnClickListener() { // from class: com.onesignal.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                e.d(aVar, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: com.onesignal.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                e.e(aVar, dialogInterface, i10);
            }
        }).show();
    }
}
