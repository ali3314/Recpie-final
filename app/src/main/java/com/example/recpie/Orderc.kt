package com.example.recpie

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button




class Orderc : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_orderc, container, false)
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

            var intent= Intent(Intent.ACTION_VIEW, Uri.parse(urlbaker))
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
                    "1 3/4 cups all purpose flour, or (plain flour), (8 oz | 227 g)\n" +
                            "3/4 cup unsweetened cocoa powder, (2.6 oz | 75 g) or regular Hershey's cocoa powder.\n" +
                            "1 1/2 teaspoon baking powder.\n" +
                            "1 1/2 teaspoon baking soda, (or bi-carb soda)\n" +
                            "1 teaspoon salt.\n" +
                            "2 cups white granulated sugar, (14 oz | 410 g)\n" +
                            "2 large eggs.."
                )
                type = "text/plain"


            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}
