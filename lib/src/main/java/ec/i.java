package ec;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements Closeable {

    /* renamed from: m, reason: collision with root package name */
    private final int f23286m = 1179403647;

    /* renamed from: n, reason: collision with root package name */
    private final FileChannel f23287n;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f23287n = new FileInputStream(file).getChannel();
    }

    private long a(d dVar, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            e eVarB = dVar.b(j12);
            if (eVarB.f23279a == 1) {
                long j13 = eVarB.f23281c;
                if (j13 <= j11 && j11 <= eVarB.f23282d + j13) {
                    return (j11 - j13) + eVarB.f23280b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    protected long U(ByteBuffer byteBuffer, long j10) throws IOException {
        f(byteBuffer, j10, 4);
        return byteBuffer.getInt() & 4294967295L;
    }

    public d c() throws IOException {
        this.f23287n.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (U(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sG = g(byteBufferAllocate, 4L);
        boolean z10 = g(byteBufferAllocate, 5L) == 2;
        if (sG == 1) {
            return new g(z10, this);
        }
        if (sG == 2) {
            return new h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23287n.close();
    }

    public List e() throws IOException {
        long j10;
        c cVarA;
        this.f23287n.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarC = c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarC.f23270a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVarC.f23275f;
        int i10 = 0;
        if (j11 == 65535) {
            j11 = dVarC.c(0).f23283a;
        }
        long j12 = 0;
        while (true) {
            if (j12 >= j11) {
                j10 = 0;
                break;
            }
            e eVarB = dVarC.b(j12);
            if (eVarB.f23279a == 2) {
                j10 = eVarB.f23280b;
                break;
            }
            j12++;
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j13 = 0;
        do {
            cVarA = dVarC.a(j10, i10);
            long j14 = cVarA.f23268a;
            if (j14 == 1) {
                arrayList2.add(Long.valueOf(cVarA.f23269b));
            } else if (j14 == 5) {
                j13 = cVarA.f23269b;
            }
            i10++;
        } while (cVarA.f23268a != 0);
        if (j13 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(dVarC, j11, j13);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(y(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    protected void f(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int i11 = this.f23287n.read(byteBuffer, j10 + j11);
            if (i11 == -1) {
                throw new EOFException();
            }
            j11 += i11;
        }
        byteBuffer.position(0);
    }

    protected short g(ByteBuffer byteBuffer, long j10) throws IOException {
        f(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    protected int s(ByteBuffer byteBuffer, long j10) throws IOException {
        f(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    protected long x(ByteBuffer byteBuffer, long j10) throws IOException {
        f(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    protected String y(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sG = g(byteBuffer, j10);
            if (sG == 0) {
                return sb2.toString();
            }
            sb2.append((char) sG);
            j10 = j11;
        }
    }
}
