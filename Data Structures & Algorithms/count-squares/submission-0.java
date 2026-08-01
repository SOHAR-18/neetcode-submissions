
class CountSquares {
    Map<String, Integer> map;
    List<int[]> points;

    public CountSquares() {
        map = new HashMap<>();
        points = new ArrayList<>();
    }

    public void add(int[] point) {
        points.add(point);
        String key = point[0] + "," + point[1];
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int ans = 0;
        for (int[] p : points) {
            int px = p[0];
            int py = p[1];
            // Must be on same vertical line
            if (px != x || py == y)
                continue;
            int d = py - y;
            // Right square
            ans += map.getOrDefault((x + d) + "," + y, 0)
                 * map.getOrDefault((x + d) + "," + py, 0);
            // Left square
            ans += map.getOrDefault((x - d) + "," + y, 0)
                 * map.getOrDefault((x - d) + "," + py, 0);
        }
        return ans;
    }
}