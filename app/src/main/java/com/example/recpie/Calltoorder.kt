package com.example.recpie

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class Calltoorder : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calltoorder, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        open2()
        sh()
    }

    fun open2() {
        val buttonto: Button = requireView().findViewById(R.id.button2)
        val urlbaker =
            "https://www.google.com/search?q=bakery+riyadh+near+me&tbm=lcl&ei=dPsKY6C4Oc2H9u8Pl-C30AY&oq=bakery+riyadh+near+me&gs_l=psy-ab.3..0i30i7k1.3857.3857.0.4263.1.1.0.0.0.0.165.165.0j1.1.0....0...1c.1.64.psy-ab..0.1.164....0.q6LNOhD9rjA#rlfi=hd:;si:9848852758446838081,l,ChViYWtlcnkgcml5YWRoIG5lYXIgbWUiA5ABAUjqjq_U5YCAgAhaKxAAEAIQAxgAGAEiFWJha2VyeSByaXlhZGggbmVhciBtZSoECAMQADICZW6SAQZiYWtlcnmaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVUjVhSEpITVhKM1JSQUKqASEKCi9tLzAyd3Y2dGgQASoRIg1iYWtlcnkgcml5YWRoKAA,y,_YTb85cdNdY;mv:[[24.853376823399653,46.93960321854187],[24.61826343758496,46.424619087682494],null,[24.73587569111058,46.68211115311218],12]&scso=_ifsKY8bcNtS79u8PoIqlsA015:114"
        buttonto.setOnClickListener() {

             var intent=Intent(Intent.ACTION_VIEW, Uri.parse(urlbaker))
            startActivity(intent)
        }
    }
        fun sh() {
            val buttonto1: Button = requireView().findViewById(R.id.button3)
            buttonto1.setOnClickListener() {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(
                        Intent.EXTRA_TEXT,
                        "1/2 cup (120g) unsalted butter, at room temperature.\n" +
                                "1 1/2 cups (300g) caster sugar (or fine white granulated sugar)\n" +
                                "2 large eggs.\n" +
                                "1/4 cup cooking oil.\n" +
                                "1 tablespoon (10g) unsweetened cocoa powder plus 1 tablespoon extra for dusting.\n" +
                                "2 1/2 tablespoons (45ml) red food colouring (liquid, not gel)"
                    )
                    type = "text/plain"


                }
                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)

            }
        }
}
