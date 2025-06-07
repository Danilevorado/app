package h1;

import android.app.Application;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23991a = new a();

    private a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        rb.h.d(processName, "getProcessName()");
        return processName;
    }
}
