package androidx.work.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4064a = new a();

    private a() {
    }

    public final File a(Context context) {
        rb.h.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        rb.h.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
