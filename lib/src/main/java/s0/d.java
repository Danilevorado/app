package s0;

import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStreamNewInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
