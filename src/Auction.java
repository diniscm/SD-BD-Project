import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Auction {
    private int state; // 0-> Canceled; 1 -> Active; 2 -> Ended
    private int code;
    private String name;
    private String description;
    private Date deadline;
    private int amount;
    private Map<String,Integer> bids;
    private Map<String,String> messages;

    public Auction(int code, String name, String description, Date deadline, int amount) {
        this.state = 1;
        this.code = code;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.amount = amount;
        this.bids = Collections.synchronizedMap(new LinkedHashMap<String, Integer>());
        this.messages = Collections.synchronizedMap(new LinkedHashMap<String, String>());
    }

    public void bid(String name, int value){
        for (int i=0;i<5;i++){
            bids.put("BIDDD"+String.valueOf(i),100*(i+1));
        }
        int first_bid = (Integer) bids.values().toArray()[0];
        int last_bid = (Integer) bids.values().toArray()[bids.values().size()-1];
        System.out.println("First bid: "+first_bid);
        System.out.println("Last bid: "+last_bid);
        System.out.println(bids);

    }

    @Override
    public String toString() {
        return "Auction{" +
                "state=" + state +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", amount=" + amount +
                ", bids=" + bids +
                ", messages=" + messages +
                '}';
    }

    public static void main(String args[]){
        Auction teste = new Auction(123456,"LALALA","LEILAO TESTE",new Date(),10);
        teste.bid("lalala",5);
        System.out.println(teste);
    }
}
