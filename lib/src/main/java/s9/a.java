package s9;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27085a;

    public a(Context context) {
        this.f27085a = context;
    }

    @Override // s9.c
    public File a() {
        Context context = this.f27085a;
        if (context == null) {
            return null;
        }
        return context.getCacheDir();
    }

    @Override // s9.c
    public File b(String str) {
        File fileD = d(str);
        if (fileD == null) {
            return null;
        }
        return new File(fileD, "index.html");
    }

    @Override // s9.c
    public File c(String str) {
        File fileD = d(str);
        if (fileD == null) {
            return null;
        }
        return new File(fileD, "pushwoosh.json");
    }

    @Override // s9.c
    public File d(String str) {
        Context context = this.f27085a;
        if (context == null) {
            return null;
        }
        return new File(context.getDir("htmls", 0), str);
    }

    @Override // s9.c
    public boolean e(String str) {
        File fileD = d(str);
        return fileD != null && fileD.exists();
    }
}
