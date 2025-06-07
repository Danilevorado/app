package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.m;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: m, reason: collision with root package name */
    int f3598m = 0;

    /* renamed from: n, reason: collision with root package name */
    final HashMap f3599n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    final RemoteCallbackList f3600o = new a();

    /* renamed from: p, reason: collision with root package name */
    private final m.a f3601p = new b();

    class a extends RemoteCallbackList {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(l lVar, Object obj) {
            MultiInstanceInvalidationService.this.f3599n.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends m.a {
        b() {
        }

        @Override // androidx.room.m
        public void L4(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f3600o) {
                String str = (String) MultiInstanceInvalidationService.this.f3599n.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f3600o.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f3600o.getBroadcastCookie(i11)).intValue();
                        String str2 = (String) MultiInstanceInvalidationService.this.f3599n.get(Integer.valueOf(iIntValue));
                        if (i10 != iIntValue && str.equals(str2)) {
                            try {
                                ((l) MultiInstanceInvalidationService.this.f3600o.getBroadcastItem(i11)).C2(strArr);
                            } catch (RemoteException e5) {
                                Log.w("ROOM", "Error invoking a remote callback", e5);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f3600o.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.m
        public void q5(l lVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f3600o) {
                MultiInstanceInvalidationService.this.f3600o.unregister(lVar);
                MultiInstanceInvalidationService.this.f3599n.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.m
        public int y3(l lVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f3600o) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f3598m + 1;
                multiInstanceInvalidationService.f3598m = i10;
                if (multiInstanceInvalidationService.f3600o.register(lVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f3599n.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f3598m--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f3601p;
    }
}
