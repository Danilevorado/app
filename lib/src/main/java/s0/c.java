package s0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u0.g;
import u0.j;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(g gVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorS = gVar.S("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorS.moveToNext()) {
            try {
                arrayList.add(cursorS.getString(0));
            } catch (Throwable th) {
                cursorS.close();
                throw th;
            }
        }
        cursorS.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                gVar.p("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static void b(g gVar, String str) {
        Cursor cursorS = gVar.S("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            if (cursorS.getCount() <= 0) {
            } else {
                throw new IllegalStateException(c(cursorS));
            }
        } finally {
            cursorS.close();
        }
    }

    private static String c(Cursor cursor) {
        int count = cursor.getCount();
        HashMap map = new HashMap();
        String string = null;
        while (cursor.moveToNext()) {
            if (string == null) {
                string = cursor.getString(0);
            }
            String string2 = cursor.getString(3);
            if (!map.containsKey(string2)) {
                map.put(string2, cursor.getString(2));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Foreign key violation(s) detected in '");
        sb2.append(string);
        sb2.append("'.\n");
        sb2.append("Number of different violations discovered: ");
        sb2.append(map.keySet().size());
        sb2.append("\n");
        sb2.append("Number of rows in violation: ");
        sb2.append(count);
        sb2.append("\n");
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : map.entrySet()) {
            sb2.append("\tParent Table = ");
            sb2.append((String) entry.getValue());
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append((String) entry.getKey());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static Cursor d(i0 i0Var, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor cursorZ = i0Var.z(jVar, cancellationSignal);
        if (!z10 || !(cursorZ instanceof AbstractWindowedCursor)) {
            return cursorZ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorZ;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : cursorZ;
    }

    public static int e(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
