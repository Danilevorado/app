package androidx.media;

import androidx.versionedparcelable.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3191a = (AudioAttributesImpl) aVar.v(audioAttributesCompat.f3191a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.x(false, false);
        aVar.M(audioAttributesCompat.f3191a, 1);
    }
}
