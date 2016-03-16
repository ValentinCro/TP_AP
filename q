car.test.frame              package:rpart              R Documentation

_A_u_t_o_m_o_b_i_l_e _D_a_t_a _f_r_o_m '_C_o_n_s_u_m_e_r _R_e_p_o_r_t_s' _1_9_9_0

_D_e_s_c_r_i_p_t_i_o_n:

     The 'car.test.frame' data frame has 60 rows and 8 columns, giving
     data on makes of cars taken from the April, 1990 issue of
     _Consumer Reports_. This is part of a larger dataset, some columns
     of which are given in 'cu.summary'.

_U_s_a_g_e:

     car.test.frame
     
_F_o_r_m_a_t:

     This data frame contains the following columns:

     'Price' a numeric vector giving the list price in US dollars of a
          standard model

     'Country' of origin, a factor with levels 'France', 'Germany',
          'Japan' , 'Japan/USA', 'Korea', 'Mexico', 'Sweden' and 'USA'

     'Reliability' a numeric vector coded '1' to '5'.

     'Mileage' fuel consumption miles per US gallon, as tested.

     'Type' a factor with levels 'Compact' 'Large' 'Medium' 'Small'
          'Sporty' 'Van'

     'Weight' kerb weight in pounds.

     'Disp.'  the engine capacity (displacement) in litres.

     'HP' the net horsepower of the vehicle.

_S_o_u_r_c_e:

     _Consumer Reports_, April, 1990, pp. 235-288 quoted in

     John M. Chambers and Trevor J. Hastie eds. (1992) _Statistical
     Models in S_, Wadsworth and Brooks/Cole, Pacific Grove, CA, pp.
     46-47.

_S_e_e _A_l_s_o:

     'car90', 'cu.summary'

_E_x_a_m_p_l_e_s:

     z.auto <- rpart(Mileage ~ Weight, car.test.frame)
     summary(z.auto)
     

