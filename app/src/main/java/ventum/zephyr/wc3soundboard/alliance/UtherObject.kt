package ventum.zephyr.wc3soundboard.alliance

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.wc3soundboard.R
import ventum.zephyr.wc3soundboard.StartActivity.Companion.getRandomFrom

object UtherObject {

    private val drawables = intArrayOf(
        R.drawable.uther,
        R.drawable.uther2
    )

    fun createUther() = SoundItems().apply {
        var i = 1
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherpissed1, R.string.utherpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherpissed2, R.string.utherpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherpissed3, R.string.utherpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherpissed4, R.string.utherpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherwarcry1, R.string.utherwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherwhat1, R.string.utherwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherwhat2, R.string.utherwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherwhat3, R.string.utherwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utherwhat4, R.string.utherwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utheryes1, R.string.utheryes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utheryes2, R.string.utheryes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utheryes3, R.string.utheryes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utheryes4, R.string.utheryes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utheryesattack1, R.string.utheryesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utheryesattack2, R.string.utheryesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.utheryesattack3, R.string.utheryesattack3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladindeath, R.string.heropaladindeath))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinpissed1, R.string.heropaladinpissed1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinpissed2, R.string.heropaladinpissed2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinpissed3, R.string.heropaladinpissed3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinpissed4, R.string.heropaladinpissed4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinpissed5, R.string.heropaladinpissed5))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinpissed6, R.string.heropaladinpissed6))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinready1, R.string.heropaladinready1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinwarcry1, R.string.heropaladinwarcry1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinwhat1, R.string.heropaladinwhat1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinwhat2, R.string.heropaladinwhat2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinwhat3, R.string.heropaladinwhat3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinwhat4, R.string.heropaladinwhat4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinyes1, R.string.heropaladinyes1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinyes2, R.string.heropaladinyes2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinyes3, R.string.heropaladinyes3))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinyes4, R.string.heropaladinyes4))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinyesattack1, R.string.heropaladinyesattack1))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinyesattack2, R.string.heropaladinyesattack2))
        add(SoundItem(drawables[i++ % drawables.size], R.raw.heropaladinyesattack3, R.string.heropaladinyesattack3))
    }
}