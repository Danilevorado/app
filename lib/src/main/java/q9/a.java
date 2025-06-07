package q9;

/* loaded from: classes2.dex */
public enum a {
    FULLSCREEN("fullscreen"),
    DIALOG("centerbox"),
    TOP("topbanner"),
    BOTTOM("bottombanner");


    /* renamed from: m, reason: collision with root package name */
    private String f26321m;

    a(String str) {
        this.f26321m = str;
    }

    public static a b(String str) {
        for (a aVar : values()) {
            if (aVar.f26321m.equals(str)) {
                return aVar;
            }
        }
        return DIALOG;
    }

    public String d() {
        return this.f26321m;
    }
}
