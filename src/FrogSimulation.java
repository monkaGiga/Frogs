public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
            public FrogSimulation(int dist, int numHops)
            {
                goalDistance = dist;
                maxHops = numHops;
            }
            private int hopDistance()
            {
                 if((int)Math.random() < .45)
                 {
                     return ((int)Math.random()*-33);
                 }
                 else
                     return ((int) Math.random() * 33);
            }
            public boolean Simulate()
            {
                int position = 0;
                for (int count = 0; count < maxHops; count++)
                {
                    position += hopDistance();
                    if (position > +goalDistance)
                    {
                        return true;
                    }
                else if (position < 0)
                    {
                        return false;
                    }
                }
                return false;
            }
            public double runSimulations(int num)
            {
                int countSuccess = 0;
                for (int count = 0; count < num ; count++)
                {
                    if(Simulate())
                    {
                        countSuccess++;
                    }

                }
                return (double)countSuccess / num;
            }
}
