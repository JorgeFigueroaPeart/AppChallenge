package edu.itesm.a01653348.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recyclerView.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapter(createData())
        }
    }
    fun createData(): ArrayList<Card> {
        val cards = ArrayList<Card>()
        cards.add(Card(R.drawable.nvidia3090,"Nvidia 3090","$1,499.00","The GeForce RTX™ 3090 is a big ferocious GPU (BFGPU) with TITAN class performance. It’s powered by Ampere—NVIDIA’s 2nd gen RTX architecture—doubling down on ray tracing and AI performance with enhanced Ray Tracing (RT) Cores, Tensor Cores, and new streaming multiprocessors."))
        cards.add(Card(R.drawable.nvidia3080,"Nvidia 3080","$699.00","The GeForce RTX™ 3080 delivers the ultra performance that gamers crave, powered by Ampere—NVIDIA’s 2nd gen RTX architecture. It’s built with enhanced RT Cores and Tensor Cores, new streaming multiprocessors, and superfast G6X memory for an amazing gaming experience."))
        cards.add(Card(R.drawable.nvidia3070,"Nvidia 3070","$499.00","The GeForce RTX™ 3070 is powered by Ampere—NVIDIA’s 2nd gen RTX architecture. Built with enhanced Ray Tracing Cores and Tensor Cores, new streaming multiprocessors, and high-speed G6 memory, it gives you the power you need to rip through the most demanding games."))
        cards.add(Card(R.drawable.nvidia3060,"Nvidia 3060","$329.00","The GeForce RTX 3060 lets you take on the latest games using the power of Ampere—NVIDIA’s 2nd generation RTX architecture. Get incredible performance with enhanced Ray Tracing Cores and Tensor Cores, new streaming multiprocessors, and high-speed G6 memory."))
        cards.add(Card(R.drawable.nvidia2080super,"Nvidia 2080 SUPER","$699.00","The NVIDIA® GeForce® RTX 2080 SUPER™ is powered by the NVIDIA Turing™ architecture with more cores, higher clocks, and faster memory for ultimate performance and incredible new levels of realism. It’s time to gear up and get super powers."))
        cards.add(Card(R.drawable.nvidia2070super,"Nvidia 2070 SUPER","$499.00","The NVIDIA® GeForce® RTX 2070 SUPER™ is powered by the NVIDIA Turing™ architecture and has a superfast GPU with more cores and faster clocks to unleash your creative productivity and gaming dominance. It’s time to gear up and get super powers."))
        cards.add(Card(R.drawable.nvidia2060super,"Nvidia 2060 SUPER","$399.00","The NVIDIA® GeForce® RTX 2060 SUPER™ is powered by the NVIDIA Turing™ architecture, bringing superfast all-around performance and graphics to every gamer and creator. It’s time to gear up and get super powers."))
        cards.add(Card(R.drawable.nvidia1660super,"Nvidia 1660 SUPER","$229.00","The GeForce GTX 1660 SUPER is up to 20% faster than the original GTX 1660 and up to 1.5X faster than the previous-generation GTX 1060 6GB. Powered by the award-winning NVIDIA Turing™ architecture and ultra-fast GDDR6 memory, it’s a supercharger for today’s most popular games. Time to gear up and get SUPER."))
        cards.add(Card(R.drawable.amd6900xt,"AMD 6900XT ","$999.00","The AMD Radeon™ RX 6900 XT graphics card, powered by AMD RDNA™ 2 architecture, featuring 80 powerful enhanced Compute Units, 128 MB of all new AMD Infinity Cache and 16GB of dedicated GDDR6 memory, is engineered to deliver ultra-high frame rates and serious 4K resolution gaming."))
        cards.add(Card(R.drawable.amd6800xt,"AMD 6800XT","$649.00","The AMD Radeon™ RX 6800 XT graphics card, powered by AMD RDNA™ 2 architecture, featuring 72 powerful enhanced Compute Units, 128 MB of all new AMD Infinity Cache and 16GB of dedicated GDDR6 memory, is engineered to deliver ultra-high frame rates and serious 4K resolution gaming."))
        cards.add(Card(R.drawable.amd6700xt,"AMD 6700XT","$479.00","The AMD Radeon™ RX 6700 XT graphics card, powered by AMD RDNA™ 2 architecture, featuring 40 powerful enhanced Compute Units, the all-new AMD Infinity Cache and 12GB of dedicated GDDR6 memory, is engineered to deliver ultra-high frame rates and powerhouse 1440p resolution gaming."))
        cards.add(Card(R.drawable.amd5950xt,"AMD 5700XT","$349.00","Designed from the ground up for exceptional 1440p performance and high-fidelity gaming."))
        cards.add(Card(R.drawable.amd5900xt,"AMD 5600XT","$279.00","The all new RDNA powered Radeon RX 5600 XT provides ultimate 1080p gaming performance. Experience highly immersive, highly customizable, high-fidelity gaming. Play your best with the Radeon RX 5600 XT."))
        cards.add(Card(R.drawable.amd5800xt,"AMD 5500XT","$199.00","Ultra-responsive, high fidelity AAA gaming with up to 60FPS and esports gaming with up to 90FPS.8"))
        cards.add(Card(R.drawable.amd5700xt,"AMD 5300XT","$150.00","The all new RDNA powered Radeon RX 5500 XT provides exceptional performance and High-fidelity gaming. Take control with Radeon RX 5300 XT and experience powerful, accelerated gaming customized for you."))
        return cards
    }
}