package ra;

import java.io.File;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final File f26674a;

    /* renamed from: b, reason: collision with root package name */
    private final File f26675b;

    /* renamed from: c, reason: collision with root package name */
    private final File f26676c;

    public a(String str, File file) {
        this.f26674a = d(file, str, "values");
        this.f26675b = d(file, str, "backup");
        this.f26676c = d(file, str, "lock");
    }

    private File b(File file, String str, String str2) {
        return new File(new File(new File(file, "preferences"), str), str2);
    }

    private File d(File file, String str, String str2) {
        File fileB = b(file, str, str2);
        if (fileB.exists() || fileB.mkdirs()) {
            return fileB;
        }
        throw new ja.a(String.format("Can't create preferences directory in %s", fileB.getAbsolutePath()));
    }

    @Override // ra.b
    public File a() {
        return this.f26676c;
    }

    @Override // ra.b
    public File c() {
        return this.f26674a;
    }

    @Override // ra.b
    public File e() {
        return this.f26675b;
    }
}
