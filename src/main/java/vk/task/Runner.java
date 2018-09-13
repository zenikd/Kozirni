package vk.task;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.UserAuthResponse;
import com.vk.api.sdk.objects.wall.responses.CreateCommentResponse;
import com.vk.api.sdk.objects.wall.responses.GetResponse;
import com.vk.api.sdk.objects.wall.responses.PostResponse;

public class Runner
{
	public static void main(String[] arg){
		TransportClient transportClient = HttpTransportClient.getInstance();
		VkApiClient vk = new VkApiClient(transportClient);

		try
		{

			UserAuthResponse authResponse = vk.oauth()
					.userAuthorizationCodeFlow(6485623, "Eu2LdpxE3QOjaw5fN1zs", "https://vk.com/dev/authcode_flow_user", "bc3c78072d92e87f1d")
					.execute();
			UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());

			PostResponse getResponse = vk.wall().post(actor).ownerId(-92453733).message("test").execute();

			CreateCommentResponse getRespons = vk.wall().createComment(actor, 129).ownerId(-166443504).message("1").execute();

		} catch (Exception e){
			e.printStackTrace();
		}




	}
}
