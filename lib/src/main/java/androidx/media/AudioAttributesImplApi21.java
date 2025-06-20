package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f3192a;

    /* renamed from: b, reason: collision with root package name */
    int f3193b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f3192a.equals(((AudioAttributesImplApi21) obj).f3192a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3192a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3192a;
    }
}
