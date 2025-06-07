package d4;

import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class l extends GoogleApiClient {

    /* renamed from: b, reason: collision with root package name */
    private final String f22914b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public l(String str) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new UnsupportedOperationException(this.f22914b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f22914b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new UnsupportedOperationException(this.f22914b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean i() {
        throw new UnsupportedOperationException(this.f22914b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void j(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f22914b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void k(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f22914b);
    }
}
