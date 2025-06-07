package x1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class s implements r1.d {

    /* renamed from: a, reason: collision with root package name */
    private final u1.b f28211a;

    public s(u1.b bVar) {
        this.f28211a = bVar;
    }

    @Override // r1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, File file, r1.h hVar) throws Throwable {
        byte[] bArr = (byte[]) this.f28211a.e(65536, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i10 = inputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i10);
                        } catch (IOException e5) {
                            e = e5;
                            fileOutputStream = fileOutputStream2;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.f28211a.d(bArr);
                            return z10;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f28211a.d(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z10 = true;
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (IOException unused2) {
        }
        this.f28211a.d(bArr);
        return z10;
    }
}
