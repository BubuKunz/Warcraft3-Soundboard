package ventum.zephyr.wc3soundboard

import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity
import ventum.zephyr.wc3soundboard.alliance.AllianceObject.createAlliance
import ventum.zephyr.wc3soundboard.alliance.ArchmageObject.createArchmage
import ventum.zephyr.wc3soundboard.alliance.ArthasObject.createArthas
import ventum.zephyr.wc3soundboard.alliance.CaptainObject.createCaptain
import ventum.zephyr.wc3soundboard.alliance.FootmanObject.createFootmans
import ventum.zephyr.wc3soundboard.alliance.GryphonObject.createGryphon
import ventum.zephyr.wc3soundboard.alliance.GyrocopterObject.createGyrocopter
import ventum.zephyr.wc3soundboard.alliance.HawkObject.createHawk
import ventum.zephyr.wc3soundboard.alliance.JainaObject.createJaina
import ventum.zephyr.wc3soundboard.alliance.KnightObject.createKnights
import ventum.zephyr.wc3soundboard.alliance.MortarObject.createMortar
import ventum.zephyr.wc3soundboard.alliance.MuradinObject.createMuradin
import ventum.zephyr.wc3soundboard.alliance.PeasantObject.createPeasants
import ventum.zephyr.wc3soundboard.alliance.PriestObject.createPriest
import ventum.zephyr.wc3soundboard.alliance.RiflemanObject.createRiflemans
import ventum.zephyr.wc3soundboard.alliance.SorceressObject.createSorceress
import ventum.zephyr.wc3soundboard.alliance.UtherObject.createUther
import ventum.zephyr.wc3soundboard.horde.FarSeerObject.createFarSeer
import ventum.zephyr.wc3soundboard.horde.GruntObject.createGrunt
import ventum.zephyr.wc3soundboard.horde.HeadHunterObject.createHeadHunter
import ventum.zephyr.wc3soundboard.horde.HordeObject.createHorde
import ventum.zephyr.wc3soundboard.horde.OgreObject.createOgre
import ventum.zephyr.wc3soundboard.horde.PeonObject.createPeon
import ventum.zephyr.wc3soundboard.horde.ShamanObject.createShaman
import ventum.zephyr.wc3soundboard.horde.TaurenHeroObject.createTaurenHero
import ventum.zephyr.wc3soundboard.horde.TaurenObject.createTauren
import ventum.zephyr.wc3soundboard.horde.ThrallObject.createThrall
import ventum.zephyr.wc3soundboard.horde.WitchDoctorObject.createWitchDoctor
import ventum.zephyr.wc3soundboard.horde.WolfriderObject.createWolfrider
import ventum.zephyr.wc3soundboard.horde.WyvernObject.createWyvern
import java.util.*

class StartActivity : SoundboardActivity() {

    companion object {
        fun getRandomFrom(array: IntArray) = array[Random().nextInt(array.size)]
    }

    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(createAllianceCategory())
        add(createHordeCategory())
    }

    private fun createAllianceCategory() =
        SoundboardCategory(getString(R.string.alliance_category), SoundItems().apply {
            addAll(createAlliance())
            addAll(createPeasants())
            addAll(createFootmans())
            addAll(createCaptain())
            addAll(createRiflemans())
            addAll(createKnights())
            addAll(createPriest())
            addAll(createSorceress())
            addAll(createMortar())
            addAll(createGyrocopter())
            addAll(createGryphon())
            addAll(createHawk())
            addAll(createMuradin())
            addAll(createJaina())
            addAll(createUther())
            addAll(createArchmage())
            addAll(createArthas())
        })

    private fun createHordeCategory() = SoundboardCategory(getString(R.string.horde_category), SoundItems().apply {
        addAll(createHorde())
        addAll(createPeon())
        addAll(createGrunt())
        addAll(createHeadHunter())
        addAll(createShaman())
        addAll(createWitchDoctor())
        addAll(createWolfrider())
        addAll(createWyvern())
        addAll(createTauren())
        addAll(createThrall())
        addAll(createFarSeer())
        addAll(createTaurenHero())
        addAll(createOgre())
    })

    override fun getBlurRadius() = 10
}
