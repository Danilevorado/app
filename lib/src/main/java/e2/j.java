package e2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import t1.v;

/* loaded from: classes.dex */
public class j implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final List f23066a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.j f23067b;

    /* renamed from: c, reason: collision with root package name */
    private final u1.b f23068c;

    public j(List list, r1.j jVar, u1.b bVar) {
        this.f23066a = list;
        this.f23067b = jVar;
        this.f23068c = bVar;
    }

    private static byte[] e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e5) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e5);
            return null;
        }
    }

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(InputStream inputStream, int i10, int i11, r1.h hVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f23067b.a(ByteBuffer.wrap(bArrE), i10, i11, hVar);
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, r1.h hVar) {
        return !((Boolean) hVar.c(i.f23065b)).booleanValue() && com.bumptech.glide.load.a.f(this.f23066a, inputStream, this.f23068c) == ImageHeaderParser.ImageType.GIF;
    }
}
