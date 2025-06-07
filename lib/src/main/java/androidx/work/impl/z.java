package androidx.work.impl;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f4298a = new z();

    private z() {
    }

    private final File c(Context context) {
        return new File(a.f4064a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        StringBuilder sb2;
        rb.h.e(context, "context");
        z zVar = f4298a;
        if (zVar.b(context).exists()) {
            b1.j.e().a(a0.f4065a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : zVar.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        b1.j.e().k(a0.f4065a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        sb2 = new StringBuilder();
                        sb2.append("Migrated ");
                        sb2.append(file);
                        sb2.append("to ");
                        sb2.append(file2);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("Renaming ");
                        sb2.append(file);
                        sb2.append(" to ");
                        sb2.append(file2);
                        sb2.append(" failed");
                    }
                    b1.j.e().a(a0.f4065a, sb2.toString());
                }
            }
        }
    }

    public final File a(Context context) {
        rb.h.e(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        rb.h.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        rb.h.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        rb.h.e(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = a0.f4066b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ub.f.a(ib.z.a(strArr.length), 16));
        for (String str : strArr) {
            hb.k kVarA = hb.o.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(kVarA.c(), kVarA.d());
        }
        return ib.a0.f(linkedHashMap, hb.o.a(fileB, fileA));
    }
}
