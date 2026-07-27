class TimeMap {

    class Pair {
        String val;
        int time;
        Pair(String v, int t) {
            val = v;
            time = t;
        }
    }

    HashMap<String, ArrayList<Pair>> map = new HashMap<>();

    public TimeMap() {}

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        ArrayList<Pair> list = map.get(key);
        int l = 0, r = list.size() - 1;
        String ans = "";

        while (l <= r) {
            int m = (l + r) / 2;
            if (list.get(m).time <= timestamp) {
                ans = list.get(m).val;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}