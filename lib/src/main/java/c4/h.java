package c4;

/* loaded from: classes.dex */
public final class h extends UnsupportedOperationException {

    /* renamed from: m, reason: collision with root package name */
    private final b4.d f4670m;

    public h(b4.d dVar) {
        this.f4670m = dVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f4670m));
    }
}
