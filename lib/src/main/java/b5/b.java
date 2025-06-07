package b5;

/* loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(i iVar) {
        if (!iVar.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excI = iVar.i();
        return new b("Complete with: ".concat(excI != null ? "failure" : iVar.n() ? "result ".concat(String.valueOf(iVar.j())) : iVar.l() ? "cancellation" : "unknown issue"), excI);
    }
}
